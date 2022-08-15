
package com.mycompany.lista3;
import java.util.Scanner;
public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String nome="t",senha="t";
      
        while(nome.equals(senha)){
        System.out.println("Informe o Login:");
        nome =sc.nextLine();
        System.out.println("Informe a Senha:");
        senha = sc.nextLine();
        System.out.println("Senha não pode ser igual ao login !!! Informe novamente.");
        }
        System.out.println("Sucesso ao cadastrar");
    } 
}
