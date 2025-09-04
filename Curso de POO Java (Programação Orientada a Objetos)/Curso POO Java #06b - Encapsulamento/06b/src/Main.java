public class Main {
    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();
        Pato p = new Pato();

        System.out.println(p.status());
        p.nadando();
        p.voando();
    }
}