package atividade01;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Valor da conta:");
        float valorConta = ler.nextFloat();
        System.out.println("Pessoas:");
        int pessoas = ler.nextInt();
        float valorPorPessoa = valorConta/pessoas;
        // ler.close();
        System.out.println(String.format("Cada pessoa vai pagar %.2f", valorPorPessoa));
    }
}
