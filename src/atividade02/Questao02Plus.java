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

        int maior = maiorDe3(n1, n2, n3);
        int menor = menorDe3(n1, n2, n3);

        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);
        ler.close();
    }

    public static int menorDe3(int n1, int n2, int n3) {
        return menor(menor(n1, n2), n3);
    }

    public static int maiorDe3(int n1, int n2, int n3) {
        return maior(maior(n1, n2), n3);
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
