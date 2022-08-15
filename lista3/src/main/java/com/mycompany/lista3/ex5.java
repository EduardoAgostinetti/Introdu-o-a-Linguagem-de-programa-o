
package com.mycompany.lista3;

import java.util.Scanner;

public class ex5 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       double A ;
       double B ;
       double taxaA ;
       double taxaB;
       double anos = 0;
       
        System.out.println("Informe os Habitantes de A");
        A = sc.nextDouble();
        System.out.println("Informe os Habitantes de B");
        B = sc.nextDouble();
        System.out.println("Informe as taxa A");
        taxaA = sc.nextDouble();
        System.out.println("Informe a taxa B");
        taxaB = sc.nextDouble();
        
       
while (A < B) {
        A = A + (A * taxaA);
        B = B + (B * taxaB);
        anos = anos + 1;

        
        }
System.out.println("Serão necessarios " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B");
    }
}