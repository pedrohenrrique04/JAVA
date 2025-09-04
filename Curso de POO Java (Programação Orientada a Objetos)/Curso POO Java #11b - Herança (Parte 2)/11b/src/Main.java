public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        v1.setNome("Pedro");
        v1.setIdade(20);
        v1.setSexo("M");
        System.out.println(v1.toString());

        Aluno a1 = new Aluno();
        a1.setNome("Paul");
        a1.setMatricula(111);
        a1.setCurso("Informatica");
        a1.setIdade(22);
        a1.setSexo("M");
        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Julia");
        b1.setMatricula(112);
        b1.setCurso("Informatica");
        b1.setIdade(15);
        b1.setSexo("F");
        b1.pagarMensalidade();

    }
}