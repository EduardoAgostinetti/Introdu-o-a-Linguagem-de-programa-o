package com.mycompany.exerciciosjava;

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[10];
        int x = 0;

        System.out.println("Coloque 10 numeros no vetor");
        for (int i = 0; i < 10; i++) {
            vetor[i] = sc.nextInt();
        }
        
        System.out.println("Coloque um numero para saber os multiplos por ele");
        x = sc.nextInt();
        int xt = 0;
        
        System.out.println("Os numeros multiplos de " + x + " são: ");
        for (int i = 0; i < 10; i++) {
            if (vetor[i] % x == 0) {
                System.out.println(vetor[i]);
                xt++;
            }
        }
       
    }
}
