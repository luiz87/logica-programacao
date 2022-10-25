package atividade03;

import java.util.Scanner;

public class Questao02 {
    /**
     * 2. Escreva um programa que vai ler uma mensagem e um número, 
     * o sistema vai repetir a mensagem digitada x vezes o número digitado.
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma mensagem");
        String mensagem = ler.nextLine();
        System.out.println("Digite de vezes para esse mensagem ser apresentada.");
        int quantidade = ler.nextInt();
        int i = 1;
        while (i <= quantidade) {
            i++;
            System.out.println(mensagem);
        }

        // for (i = 1; i <= quantidade; i++) {
        //     System.out.println(mensagem);
        // }
        ler.close();
    }
}
