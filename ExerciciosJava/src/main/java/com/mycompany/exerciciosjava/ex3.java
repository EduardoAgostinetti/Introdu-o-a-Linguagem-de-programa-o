package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class ex3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int[10];
        int soma =0, aux = 0, nrep = 0;
        
        System.out.println("Coloque os 10 numeros do vetor: ");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
            }
         
         
        for (int j = 0; j < 10; j++) {
            
            if (vetor[j] != aux){
                
                aux = vetor[j];
                
                
            }else{
                nrep = vetor[j];
                System.out.println("Repetido: " + nrep);
            }
        }
         
       
       

    }
}
