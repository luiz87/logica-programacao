package atividade01;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1 numero:");
        double nota01 = ler.nextDouble();
        System.out.println("Digite 1 numero:");
        double nota02 = ler.nextDouble();
        // ler.close();
        double media = (nota01 + nota02) / 2;
        System.out.println("Média Final: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
