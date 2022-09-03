package com.mycompany.exerciciosjava;
import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
            int vetor[] = new int[20];
            boolean aux;
            
            System.out.println("Coloque 20 numeros: ");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = sc.nextInt();
            }
            System.out.println("Numeros que nao repetiram");
            for (int i = 0; i < vetor.length; i++) {
                aux = true;
                for (int j = 0; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j] && i!=j) {
                        aux = false;
                        break;
                    }
                }
                
                if(aux){
                    System.out.print(vetor[i] + " | ");
                }
            }
    }
}
