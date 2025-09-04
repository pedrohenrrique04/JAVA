public class Main {
    public static void main(String[] args) {
        Analista a = new Analista("Julia", 10000, "Javascript");

        Gerente g = new Gerente("Pedro", 5000, "Desenvolvimento");

        ;

        System.out.println(g.toString()+g.calcularBonus());
        System.out.println(a.toString()+a.calcularBonus());
    }
}