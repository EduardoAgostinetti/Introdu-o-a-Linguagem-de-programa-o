package com.mycompany.lista3;

import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int x;
        
        System.out.println("Informe os numero nas linha ou um embaixo do outro ?");
        System.out.println("1 - embaixo do outro");
        System.out.println("2 - na linha");
        x = sc.nextInt();
        
        switch (x){
                
            case 1:
                    for (i = 1; i <= 20; i++) {
                       System.out.println(i);
                       
                   }break;
                    
            case 2:
                for ( j = 1; j <= 20; j++) {
                    System.out.print(j+" ");
                    
                }break;
        }
    }
}
