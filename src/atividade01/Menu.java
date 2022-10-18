package atividade01;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        String escolha = "";
        Scanner entrada = new Scanner(System.in);
        while (!escolha.equals("x")) { // equivalente> escolha != "x"
            System.out.println("Escolha a questão!");
            System.out.println("a) Questão 00");
            System.out.println("b) Questão 01");
            System.out.println("c) Questão 02");
            System.out.println("d) Questão 03");
            System.out.println("e) Questão 04");
            System.out.println("f) Questão 05");
            System.out.println("g) Questão 06");
            System.out.println("x) Para encerrar");
            
            escolha = entrada.next();
            // ler.close();
            switch (escolha) {
                case "a":
                    System.out.println("-- Questao00 --");
                    Questao00.main(args);
                    break;
                case "b":
                    System.out.println("-- Questao01 --");
                    Questao01.main(args);
                    break;
                case "c":
                    System.out.println("-- Questao02 --");
                    Questao02.main(args);
                    break;
                case "d":
                    System.out.println("-- Questao03 --");
                    Questao03.main(args);
                    break;
                case "e":
                    System.out.println("-- Questao04 --");
                    Questao04.main(args);
                    break;
                case "f":
                    System.out.println("-- Questao05 --");
                    Questao05.main(args);
                    break;
                case "g":
                    System.out.println("-- Questao06 --");
                    Questao06.main(args);
                    break;
                default:
                    System.out.println("Escolha outra opção");
                    break;
            }
        }
        entrada.close();

    }
}
