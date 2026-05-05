public class Cruzeiro extends Barco {
    private int numQuartos;
    private int numPisos;
    private String nomeDoBarco;

    public Cruzeiro() {
        this.numQuartos = 0;
        this.numPisos = 0;
        this.nomeDoBarco = "";
    }
    
    public Cruzeiro(int numQuartos, int numPisos, String nomeDoBarco) {
        this.numQuartos = numQuartos;
        this.numPisos = numPisos;
        this.nomeDoBarco = nomeDoBarco;
    }


    public void mostraInfoCruzeiro() {
        mostraInfo();
        System.out.println("Número de quartos: " + this.numQuartos);
        System.out.println("Número de pisos: " + this.numPisos);
        System.out.println("Nome do cruzeiro: " + this.nomeDoBarco);
    }
    
}
