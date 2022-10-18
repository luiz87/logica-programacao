package atividade01;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite 1 núemro:");
        int n = ler.nextInt();
        ler.close();
        System.out.print("Anterior: "+(n-1)+"\nPosterior: "+(n+1)+"\nDigitado: "+n);
    }
}
