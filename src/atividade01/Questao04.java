package atividade01;

import java.util.Scanner;

public class Questao04 {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();
        System.out.println("Valor da hora:");
        float valorHora = ler.nextFloat();
        System.out.println("Quantas horas trabalhadas:");
        float totalHora = ler.nextFloat();
        ler.close();
        float salario = valorHora * totalHora;
        System.out.println(nome+" vai receber "+ salario);
    }
}
