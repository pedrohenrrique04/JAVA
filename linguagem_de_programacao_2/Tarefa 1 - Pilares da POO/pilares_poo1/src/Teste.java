public class Teste {
    public static void main(String[] args) {
        Animal c = new Cachorro("toto", "preto", "normal");
        Animal g = new Gato("pit", "amarelo");

        System.out.println(c.emitirSom());
        System.out.println(g.emitirSom());
    }
}
