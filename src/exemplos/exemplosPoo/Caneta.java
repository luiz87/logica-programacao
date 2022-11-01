package exemplos.exemplosPoo;

public class Caneta {

    private String modelo;
    private String cor;
    private int carga;
    private boolean tampa;

    // método contrutor
    Caneta(String modelo, String cor) {
        tampa = false;
        this.modelo = modelo;
        this.cor = cor;
        carga = 30;
    }

    void rabiscar() {
        escrever("Rabisco");
    }

    void escrever(String texto) {
        if (tampa) {
            if(carga >= texto.length()){
                System.out.println(texto);
                texto = texto.replaceAll(" ", "");
                carga -= texto.length();
            }else{
                System.out.println("Carga insuficioente.");
            }
        } else {
            System.out.println("Retire a tampa");
        }
    }

    void tampar() {
        tampa = false;
    }

    void destampar() {
        tampa = true;
    }

    @Override
    public String toString() {
        return "Caneta [carga=" + carga + ", cor=" + cor + ", modelo=" + modelo + ", tampa=" + tampa + "]";
    }

    public void printStatus() {
        System.out.println(toString());
    }

}
