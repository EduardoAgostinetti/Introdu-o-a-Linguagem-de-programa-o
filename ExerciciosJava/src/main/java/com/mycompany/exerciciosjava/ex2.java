
package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] vetor = new int [5];
        int auxiliarMaior = 0, auxiliarMenor = 999999999,  soma = 0,aux = 0, resultado = 0, media = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Coloque 5 valores");
            vetor[i] = sc.nextInt();
            }
        System.out.println("Valoroes");
        for (int j = 0; j < 5; j++) {
            System.out.println(vetor[j]);
        }
        for (int k = 0; k < 5; k++) {
            if (k == 0) {
                auxiliarMaior = vetor[k];
                auxiliarMenor = vetor[k];
            }
            else if (vetor[k] > auxiliarMaior) {
                auxiliarMaior = vetor[k];
            }else if(vetor[k] < auxiliarMenor){
               auxiliarMenor = vetor[k];
            }
            
        }
        System.out.println("o maior valor é: "+ auxiliarMaior);
        System.out.println("O menor valor é: " + auxiliarMenor);
        
         for (int l = 0; l < 5; l++) {

            
                soma = aux + vetor[l];
                aux = vetor[l];
                resultado = resultado + aux;
                
                media = resultado/5;
                
            
        }
         System.out.println("A média é : " + media);
    }
}
