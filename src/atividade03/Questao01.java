package atividade03;

import java.util.Scanner;

public class Questao01 {
    /**
     * 1. Escreva um programa que vai ler um número,
     * o sistema vai escrever na tela a tabuada de 1 até 10 do número digitado.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número.");
        int numero = ler.nextInt();
        // while, do-while, for esta correto
        for (int i = 1; i <= 10; i++) {
            // System.out.println(String.format("%s x %s = %s ", numero, i, i * numero));
            System.out.printf("%s x %s = %s \n", numero, i, i * numero);
        }
        ler.close();
    }
}
