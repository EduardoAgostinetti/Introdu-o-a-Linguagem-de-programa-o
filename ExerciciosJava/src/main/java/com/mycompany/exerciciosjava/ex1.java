package com.mycompany.exerciciosjava;
import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int soma = 0;
        int aux = 0;
        int resultado = 0;
        System.out.println("Coloque os 10 numeros do vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
            }

        for (int j = 0; j < 10; j++) {

            if (vetor[j] > 0) {
                soma = aux + vetor[j];
                aux = vetor[j];
                resultado = resultado + aux;
                
            }
        }
        System.out.println("O Resutlado da soma dos pares é: " + resultado);
       

    }

}
