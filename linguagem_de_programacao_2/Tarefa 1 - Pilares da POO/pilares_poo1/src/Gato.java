public final class Gato extends Animal{

    public Gato(String nome, String cor) {
        super(nome, cor);
    }

    @Override
    public String emitirSom() {
        return "Miau";
    }
}
