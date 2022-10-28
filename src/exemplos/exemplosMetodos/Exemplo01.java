package exemplos.exemplosMetodos;

public class Exemplo01 {
    public static void main(String[] args) {
        Exemplo00.boasVindas();
        Exemplo00.ateLogo();
        int[] numeros = {1,1,1};
        Exemplo00.somarNumeros(numeros);
        numeros[0] = 2;
        numeros[1] = 2;
        numeros[2] = 2;
        Exemplo00.somarNumeros(numeros);
        int[] aleatorio = {3,7,9,2,41,2,4};
        System.out.println(Exemplo00.maior(aleatorio));
        System.out.println(Exemplo00.menor(aleatorio));
    }
}
