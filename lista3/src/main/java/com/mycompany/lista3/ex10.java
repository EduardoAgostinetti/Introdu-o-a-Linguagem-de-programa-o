
package com.mycompany.lista3;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Informe dois números");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        for(int i = num1 + 1; i < num2; i++){
            System.out.print(i + " ");
        }

    }
}
