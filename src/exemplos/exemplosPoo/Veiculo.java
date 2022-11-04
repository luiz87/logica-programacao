package exemplos.exemplosPoo;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int velocidade;

    public void buzinar() {
        System.out.println("Fom Fomm");
    }

    public void acelerar(int valor) {
        System.out.print(velocidade + " + " + valor);
        velocidade += valor;
        if (velocidade >= 200) {
            velocidade = 200;
        }
        System.out.println(" > " + velocidade);
    }

    public void frear(int valor) {
        System.out.print(velocidade + " - " + valor);
        velocidade -= valor;
        if (velocidade < 0) {
            velocidade = 0;
        }
        System.out.println(" > " + velocidade);
    }

    @Override
    public String toString() {
        return "Veiculo [marca=" + marca + ", modelo=" + modelo + ", velocidade=" + velocidade + "]";
    }

    public void printStatus() {
        System.out.println(toString());
    }

    // métodos de retorno
    public String getMarca(){
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    // metodo de acesso
    // public void setMarca(String marca){
    //     this.marca = marca;
    // }
}
