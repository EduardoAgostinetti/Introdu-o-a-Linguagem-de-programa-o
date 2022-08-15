
package com.mycompany.lista3;

import java.util.Scanner;

public class ex4 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double A = 80000;
       double B = 200000;
       double taxaA = 0.03;
       double taxaB = 0.015;
       double anos = 0;
       
while (A < B) {
        A = A + (A * taxaA);
        B = B + (B * taxaB);
        anos = anos + 1;

        
        }
System.out.println("Serão necessarios " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B");
    }
}
