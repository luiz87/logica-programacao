package atividade03;

import java.util.Scanner;

public class Questao06 {
    /**
     * Escreva um programa que vai ler 5 números o sistema vai mostrar
     * o maior o menor a soma e a média dos números digitados.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int maior = -2147483648;
        int menor = 2147483647;
        int soma = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite um numero");
            int num = ler.nextInt();
            if (num > maior) {
                maior = num;
            }
            if (num < menor) {
                menor = num;
            }
            soma = soma + num;
        }
        ler.close();
        System.out.println("Maior = " + maior);
        System.out.println("Menor = " + menor);
        System.out.println("Soma = " + soma);
        System.out.println("Média = " + (soma / 5));
        System.out.println("Resto = " + (soma % 5)); // calculo do módulo que é o resto da operação
        float media = soma / 5f;
        System.out.printf("Média fracionada = %.2f", media);
    }
}
