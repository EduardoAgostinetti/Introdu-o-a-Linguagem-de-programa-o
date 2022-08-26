
package com.mycompany.prova;
import java.util.Scanner;
public class ex2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double percentualProx = (1.5/100);
        double salario = 1000;
        int i;
            salario = salario + (salario * percentualProx);
        for ( i = 1997; i < 2022; i++) {
            
            percentualProx = percentualProx  * 2;
            salario = salario + (salario*percentualProx);
        
        }
        System.out.println("O salario " + i + " dele foi aumentando assim : " + salario);
    }
}
