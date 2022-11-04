package exemplos.exemplosPoo;

public class Moto extends Veiculo {

    private int cilindradas;

    Moto(String marca, int cilindradas) {
        this.marca = marca;
        this.cilindradas = cilindradas;
    }

    Moto(String marca, String modelo, int cilindradas) {
        this.marca = marca;
        this.modelo = modelo;
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public String toString() {
        return "Moto [marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade + ", cilindradas="
                + cilindradas + "]";
    }

    public void printStatus() {
        System.out.println(toString());
    }
}
