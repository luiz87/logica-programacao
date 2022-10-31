package exemplos.exemplosMetodos;

public class Exemplo02 {
    public static void main(String[] args) {
        int nFinal = somaRecusiva(3);
        System.out.println(nFinal);
    }

    // 3+2+1 = 6
    static int somaRecusiva(int n) {
        if (n > 0) {
            return n + somaRecusiva(n - 1);
        } else {
            return 0;
        }
    }
}
