public class Main {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[2];
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.75f, 68.9f, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68f, 57.8f, 14, 2, 3);

        Luta uec01 = new Luta();
        uec01.marcarLuta(l[0],l[1]);
        uec01.lutar();
        System.out.println(l[0].status());
        System.out.println(l[1].status());
    }
}