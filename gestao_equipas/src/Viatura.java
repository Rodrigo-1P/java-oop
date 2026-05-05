public class Viatura {

    private String tipo;
    private int numRodas;
    private int velMaxima;
    private String matricula;

    public Viatura() {
    }

    
    public Viatura(String tipo, int numRodas, int velMaxima, String matricula) {
        this.tipo = tipo;
        this.numRodas = numRodas;
        this.velMaxima = velMaxima;
        this.matricula = matricula;
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


    public String getMatricula() {
        return matricula;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }


    public void mostraInfo() {
        System.out.println("Vou mostrar a informação do carro =?=");
        System.out.println("Tipo do carro: " + this.tipo);
        System.out.println("Número de rodas: " + this.numRodas);
        System.out.println("Velocidade Máxima: " + this.velMaxima);
        System.out.println("Matrícula: " + this.matricula);
    }
}
