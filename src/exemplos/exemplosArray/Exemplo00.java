package exemplos.exemplosArray;

public class Exemplo00 {
    public static void main(String[] args) {
        String pessoa1 = "Bruxo do 71";
        String pessoa2 = "Seu barriga";

        // array inicia da posição 0
        String[] pessoas = { "Chaves", "Seu Madruga", "Dona Florinda", "Chiquinha", pessoa1, pessoa2 };
        System.out.println(pessoas.length);
        System.out.println("laço for >>");
        for (int i = 0; i < pessoas.length; i++) {
            String pessoa = pessoas[i];
            System.out.println(pessoa);
        }
        pessoas[0] = "Kiko";
        // foreach
        System.out.println("laço foreach >>");
        for (String pessoa : pessoas) {
            System.out.println(pessoa);
        }
        System.out.println("laço for decremental >>");
        for (int i = pessoas.length - 1; i >= 0; i--) {
            String pessoa = pessoas[i];
            System.out.println(pessoa);
        }
    }
}
