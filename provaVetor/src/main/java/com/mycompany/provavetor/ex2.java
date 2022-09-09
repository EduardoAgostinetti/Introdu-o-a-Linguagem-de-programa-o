package com.mycompany.provavetor;
import java.util.Scanner;
public class ex2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double percentualProx = (1.5/100);
        double salario = 1000;
        double [] vetor = new double[25];
        int i;
        
        
            salario = salario + (salario * percentualProx);
        for ( i = 0; i < vetor.length; i++) {
            
            percentualProx = percentualProx  * 2;
            salario = salario + (salario*percentualProx);
            vetor[i] = salario;
             System.out.println("O salario " + i + " dele foi aumentando assim : " + vetor[i]);
        }
       
        
    }
}
