
public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        Funcionario funcionario = new Funcionario();

        pessoa.setNome("pedro");
        aluno.setNome("Maria");
        professor.setNome("Claúdio");
        funcionario.setNome("Fabiana");

        aluno.setCurso("Informatica");

        professor.setSalario(2500.50f);

        funcionario.setSetor("Estoque");

        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(funcionario.toString());
    }
}