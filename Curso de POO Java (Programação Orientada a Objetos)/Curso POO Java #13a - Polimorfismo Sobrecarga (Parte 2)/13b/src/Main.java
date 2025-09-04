public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();

        c.reagir("Ola");
        c.reagir("vai apanhar");
        c.reagir(11,45);
        c.reagir(19, 0);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,12.5f);
        c.reagir(17,4.5f);
    }
}