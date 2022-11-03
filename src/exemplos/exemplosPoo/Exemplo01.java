package exemplos.exemplosPoo;

public class Exemplo01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("FIAT", "Palio");
        c1.printStatus();
        c1.acelerar(20);
        c1.acelerar(50);
        c1.acelerar(200);
        c1.frear(100);
        c1.frear(150);
        c1.printStatus();
        
        System.out.println(c1.getMarca());
        // c1.setMarca("Nova marca");
        System.out.println(c1.getModelo());
        System.out.println(c1.getVelocidade());
    }
}
