public class Viatura {

    private String tipo;
    private int numRodas;
    private int velMaxima;

    public Viatura() {
    }
    public Viatura(String tipo, int numRodas, int velMaxima) {
        this.tipo = tipo;
        this.numRodas = numRodas;
        this.velMaxima = velMaxima;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getNumRodas() {
        return numRodas;
    }
    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }
    public int getVelMaxima() {
        return velMaxima;
    }
    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }

    public void mostraInfo() {
        System.out.println("Vou mostrar a informação do carro =?=");
        System.out.println("Tipo do carro: " + this.tipo);
        System.out.println("Número de rodas: " + this.numRodas);
        System.out.println("VElocidade Máxima: " + this.velMaxima);
    }
}
