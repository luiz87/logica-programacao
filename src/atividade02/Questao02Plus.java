package atividade02;

import java.util.Scanner;

public class Questao02Plus {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um número");
        int n1 = ler.nextInt();
        System.out.println("Digite um número");
        int n2 = ler.nextInt();
        System.out.println("Digite um número");
        int n3 = ler.nextInt();

        int maior = maior(maior(n1, n2), n3);
        int menor = menor(menor(n1, n2), n3);

        System.out.println("Maior "+ maior);
        System.out.println("Menor "+ menor);
        ler.close();
    }

    // exemplo pra ser equivalente ao Math.max()
    public static int maior(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    // exemplo para ser equivalente ao Meth.min()
    public static int menor(int x, int y) {
        if (x < y) {
            return x;
        } else {
            return y;
        }
    }

}
