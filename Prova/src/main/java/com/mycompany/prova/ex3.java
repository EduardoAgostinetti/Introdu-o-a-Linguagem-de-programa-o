package com.mycompany.prova;

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double massaInicial, tempo = 0, massaAtual, tempoHoras = 0, tempoMinutos = 0;

        System.out.println("Qual a massa inicial em gramas");
        massaAtual = sc.nextDouble();
        massaInicial = massaAtual;
        while (massaAtual >= 0.5) {

            massaAtual = (massaAtual / 2);
            tempo = tempo + 50;
            tempoMinutos = tempo / 60;
            tempoHoras = tempo / 3600;

        }
        System.out.println("Massa inicial :" + massaInicial);
        System.out.println("Massa final: " + massaAtual);
        System.out.println("Tempo em segundos: " + tempo);
        System.out.println("Tempo em horas: " + tempoHoras);
        System.out.println("Tempo em minutos: " + tempoMinutos);
    }
}
