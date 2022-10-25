package atividade03;

import java.util.Scanner;

public class Questao04 {
    /**
     * 4. Escreva um programa que vai ler uma palavra,
     * se a palavra for diferente de "Java-2022" o
     * retorno vai ser "Palavra Errada" se igual "Palavra Ok"
     * a pessoa pode faze no máximo 5 tentativas de acertar a palavra.
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String palavra = "";
        int i = 0;
        do {
            i++;
            System.out.println("Digite a palavra (Tentativa " + i + "/5)");
            palavra = ler.nextLine();
            if (palavra.equals("Java-2022")) {
                System.out.println("Palavra Ok");
                // break; força a saida do laço de repetição
            } else {
                System.out.println("Palavra Errada");
            }
        } while (!palavra.equals("Java-2022") && i < 5);
        // enquanto a palavra for diferente da senha e o contador menor que 5 REPITA..
        ler.close();
    }
}
