

package com.mycompany.lista3;

import java.util.Scanner;

public class ex1 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        System.out.println("Informe o numero um valor entr 0 e 10");
        num = sc.nextInt();
        while (num < 0 || num > 10) {
          System.out.println("erro, Informe outro numero");
          num = sc.nextInt();
        }
       System.out.println("sucesso");
    }
}
