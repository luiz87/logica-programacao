package atividade01;

import java.util.Scanner;

public class Questao01Plus {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1 numero:");
        double nota01 = ler.nextDouble();
        System.out.println("Digite 1 numero:");
        double nota02 = ler.nextDouble();
        ler.close();
        double media = (nota01 + nota02) / 2;
        System.out.println("Média Final : " + media);
        // aprovado >= 7, recuperação >= 4 , reprovado < 4, erro digitação > 10 ou < 0
        if (media > 10 || media < 0) { 
            System.out.println("Erro digitação");
        } else if (media < 4) {
            System.out.println("Reprovado");
        } else if (media < 7){
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }

    }
}
