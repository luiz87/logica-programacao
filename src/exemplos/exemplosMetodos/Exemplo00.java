package exemplos.exemplosMetodos;

public class Exemplo00 {

    // static é um método que pertence a classe
    // static não exige a obrigação de declarar o objeto pra usar
    static void boasVindas() {
        System.out.println("Seja bem vindo");
    }

    static void ateLogo() {
        System.out.println("Volte sempre");
    }

    static void somarNumeros(int[] numeros) {
        int total = 0;
        for (int n : numeros) {
            total += n;
        }
        System.out.println(total);
    }

    static int maior(int[] numeros) {
        int maior = -9999999;
        for (int n : numeros) {
            if (n > maior) {
                maior = n;
            }
        }
        return maior;
        // System.out.println(maior);
    }

    static int menor(int[] numeros) {
        int menor = 9999999;
        for (int n : numeros) {
            if (n < menor) {
                menor = n;
            }
        }
        return menor;
    }

}
