
package com.mycompany.lista3;

import java.util.Scanner;

public class ex3 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome, sexo, estCivil;
        int idade, Verif;
        double salario;
        boolean teste = true;

        Verif = 0;
        do {
            if (Verif == 1) {
                System.out.println("Nome com no minimo 4 três letras");
            }
            System.out.print("Nome: ");
            nome = sc.nextLine();

            Verif = 1;
        } while (nome.length() <= 3);

        Verif = 0;
        do {
            if (Verif == 1) {
                System.out.println("Coloque uma dessas opções, entre 0 e 150");
            }
            System.out.print("Idade: ");
            idade = sc.nextInt();
            Verif = 1;
        } while (idade < 0 || idade > 150);

        Verif = 0;
        do {
            if (Verif == 1) {
                System.out.println("Salário maior que 0");
            }
            System.out.print("Salário: ");
            salario = sc.nextDouble();
            Verif = 1;
        } while (salario <= 0);

        Verif = 0;
        do {
            if (Verif == 1) {
                System.out.println("Coloque uma dessas opções f ou m");
            }
            System.out.print("Sexo: ");
            sexo = sc.next();
            Verif = 1;
            if (sexo.equals("f") || sexo.equals("m")) {
                teste = false;
            }
        } while (teste);

        Verif = 0;
        teste = true;
        do {
            if (Verif == 1) {
                System.out.println("Coloque uma dessas opções s/c/v/d");
            }
            System.out.print("Estado civil: ");
            estCivil = sc.next();
            Verif = 1;
            if (estCivil.equals("s") || estCivil.equals("c") || estCivil.equals("v")
                    || estCivil.equals("d")) {
                teste = false;
            }

        } while (teste);

        switch (estCivil) {
            case "s":
                estCivil = "Solteiro";
                break;
            case "c":
                estCivil = "Casado";
                break;
            case "v":
                estCivil = "Viúvo";
                break;
            case "d":
                estCivil = "Casado";
                break;
        }

         System.out.println("Cadastrado com sucesso !");
    }
}
