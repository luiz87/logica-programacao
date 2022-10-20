package atividade02;

import java.util.Scanner;

/**
 * 5. Escreva um programa que dada a idade de uma pessoa,
 * retorna uma das seguintes mensagens:
 * “Não pode nem votar e nem dirigir”,
 * “Pode votar, mas não pode dirigir”,
 * “Pode votar e pode dirigir”.
 */
public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = ler.nextInt();
        if (idade < 16) {
            System.out.println("Não pode nem votar e nem dirigir.");
        } else if (idade < 18) {
            System.out.println("Pode votar, mas não pode dirigir.");
        } else {
            System.out.println("Pode votar e pode dirigir");
        }
        ler.close();
    }
}
