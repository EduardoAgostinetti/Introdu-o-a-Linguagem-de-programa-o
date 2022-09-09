
package com.mycompany.provavetor;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor [] = new int [5];
        int menor = 0, maior = 0;
        
        System.out.println("Escreva 5 numeros: ");
        for (int i = 0; i < 5; i++) {
            vetor[i] = sc.nextInt();
          if (i == 0) {
              maior = vetor[i];
              menor = vetor [i];
        }if (vetor[i]> maior){
            maior = vetor[i];
        }else if(vetor[i] < menor){
            menor = vetor[i];
        }
        }
        System.out.println("O maior é: " + maior);
        System.out.println("O menor é: " + menor);
      
        
    }
}
