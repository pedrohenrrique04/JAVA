public class Cachorro extends Animal{

    private String raca;

    @Override
    public String emitirSom() {
        return "Au Au ";
    }

    public Cachorro(String nome, String cor, String raca) {
        super(nome, cor);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
