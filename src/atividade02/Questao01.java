package atividade02;

import java.util.Scanner;

/**
 * Questao01
 * Escreva um programa que leia um número e escreva na tela
 * se o número é menor, igual ou maior que zero
 */
public class Questao01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = ler.nextInt();
        // %s caractere coringa pra ser subtituido pela váriavel/valor.
        String mensagem = "O número %s é %s que Zero.";
        if (numero < 0) {
            mensagem = String.format(mensagem, numero, "menor");
        } else if (numero > 0) {
            mensagem = String.format(mensagem, numero, "maior");
        } else {
            mensagem = String.format(mensagem, numero, "igual");
            mensagem = mensagem.replaceAll("que", "a");
        }
        System.out.println(mensagem);
        ler.close();
    }
}