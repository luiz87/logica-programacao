package atividade02;

import java.util.Scanner;

/**
 * 6. Escreva um programa para calcular O IMC (índice de massa corpórea) que
 * indica o grau de obesidade de uma pessoa.
 * Este índice é obtido pelo peso (em kg) dividido pelo quadrado da altura (em
 * metros).
 * Entradas peso e altura, saída resultado do IMC e Avaliação.
 * A tabela a seguir apresenta as faixas deste índice:
 * IMC = Avaliação
 * menor que 20 = Abaixo do normal
 * entre 20, 25 = Normal
 * entre 25, 30 = Sobrepeso
 * entre 30, 35 = Obesidade leve
 * entre 35, 40 = Obesidade moderada
 * maior que 40 = Obesidade mórbida
 */
public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o peso");
        float peso = ler.nextFloat();
        System.out.println("Digite a altura");
        float altura = ler.nextFloat();
        float imc = peso / (altura * altura);
        String avaliacao;
        if (imc < 20) {
            avaliacao = "Abaixo do normal";
        } else if (imc < 25) {
            avaliacao = "Normal";
        } else if (imc < 30) {
            avaliacao = "Sobrepeso";
        } else if (imc < 35) {
            avaliacao = "Obesidade leve";
        } else if (imc < 40) {
            avaliacao = "Obesidade moderada";
        } else {
            avaliacao = "Obesidade mórbida";
        }
        System.out.println(String.format(
                "O resultado do seu IMC é %.2f e você esta na condição %s", imc, avaliacao));
        ler.close();
    }
}
