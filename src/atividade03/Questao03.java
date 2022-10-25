package atividade03;

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero");
        int n1 = ler.nextInt();
        System.out.println("Digite outro numero");
        int n2 = ler.nextInt();
        // desafio se n1 for maior que o n2 tambem escrever a sequencia usando apenas um for.
        for (int i = n1; i <= n2; i++) {
            System.out.println(">"+i);
        }
        ler.close();
    }
}
