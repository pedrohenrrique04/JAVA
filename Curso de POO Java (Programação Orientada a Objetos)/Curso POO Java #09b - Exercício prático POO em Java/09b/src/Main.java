public class Main {
    public static void main(String[] args) {
        Pessoa p[] = new Pessoa[2];
        Livro l[] = new Livro[3];

        p[0] = new Pessoa("Pedro", 20, "M");
        p[1] = new Pessoa("Julia", 15, "F");

        l[0] = new Livro("50 tons de amarelo", "Vincent van Gogh", 993, p[0]);
        l[1] = new Livro("Poo para iniciantes", "Pedro Paulo", 500, p[0]);
        l[2] = new Livro("Eu sou Wandinha", "Universo dos Livros", 24, p[1]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
        System.out.println(l[2].detalhes());
    }
}