package exemplos;

public class ExemploLacoRepeticao {
    public static void main(String[] args) {
        int contar = 1; // i
        while (contar <= 10) {
            System.out.print(contar);
            System.out.println(" < dentro do loop while");
            contar++; // equivalente> contar = contar + 1;
        }

        do {
            contar--; // equivalente> contar = contar - 1;
            System.out.print(contar);
            System.out.println(" <  dentro do loop do-while");
        } while (contar > 1);

        // 1-star da variavl; 2-condicação da repetição; formar de incremento 
        for(int i = 1; i <= 10; i++){
            System.out.print(i);
            System.out.println(" < dentro de loop for");
        }
    }
}
