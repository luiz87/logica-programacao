package atividade01;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do jantar:");
        float jantar = ler.nextFloat();
        // ler.close();
        System.out.println(jantar + " + 10% " + (jantar * 1.1));
        float gorjeta = (jantar / 100)*10;
        System.out.println(String.format("%.2f + 10%s = %.2f", jantar,"%",(gorjeta+jantar)));
    }
}
