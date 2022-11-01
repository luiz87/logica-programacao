package exemplos.exemplosPoo;

public class Exemplo00 {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta("BIC","Azul");
        caneta1.printStatus();
        caneta1.rabiscar();
        caneta1.printStatus();
        caneta1.destampar();
        caneta1.rabiscar();
        caneta1.printStatus();
        caneta1.escrever("Luiz Felipe Freire Maia");
        caneta1.printStatus();
        caneta1.escrever("Luiz");
        caneta1.printStatus();
        Caneta caneta2 = new Caneta("BIC", "Preta");
        caneta2.printStatus();
    }
}
