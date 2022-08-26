package com.mycompany.prova;

import java.util.Scanner;

public class ex1 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num1, auxMaior = 0, auxMenor = 0;
        
        System.out.println("Coloque 5 numeros inteiros ");
        
        for (int i = 0; i < 5; i++) {
            num1 = sc.nextInt();
            if (i == 0) {
                auxMaior = num1;
                auxMenor = num1;
            }else if (num1 > auxMaior) {
                auxMaior = num1;
            }else if (num1 < auxMenor) {
                auxMenor = num1;
            }
        }
        System.out.println("O maior numero mencionado: " + auxMaior);
        System.out.println("O menor numero mencionado: " + auxMenor);

    }
}
