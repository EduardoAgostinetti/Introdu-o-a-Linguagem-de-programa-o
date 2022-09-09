
package com.mycompany.provavetor;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double [] vetor = new double [5];
        
        System.out.println("Qual a massa inicial em gramas");
        vetor[1] = sc.nextDouble();
        vetor[0] = vetor[1];
        while (vetor[1] > 0.5) {

            vetor[1] = (vetor[1] / 2);
            vetor[2] = vetor[2] + 50;
            vetor[4] = vetor[2] / 60;
            vetor[3] = vetor[2] / 3600;

        }
        System.out.println("Massa inicial :" + vetor[0]);
        System.out.println("Massa final: " + vetor[1]);
        System.out.println("Tempo em segundos: " + vetor[2]);
        System.out.println("Tempo em horas: " + vetor[3]);
        System.out.println("Tempo em minutos: " + vetor[4]);
    }
}