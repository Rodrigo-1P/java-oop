public class Barco extends Viatura{

    private boolean temPiscina;

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }    
    
    public Barco() {
        super("Barco", 0, 0, "");
    }
    
    @Override

    public void mostraInfo() {
        System.out.println("Vou mostrar a informação do barco");
        System.out.println("Tipo de barco: " + getTipo());
        System.out.println("Número de rodas: " + getNumRodas());
        System.out.println("Velocidade Máxima: " + getVelMaxima());
        System.out.println("Matrícula: " + getMatricula());
        if(temPiscina){
            System.out.println("Tem piscina :-) ");
        }else {
            System.out.println("Não tem piscina :-) ");
        }
    }

    
}
