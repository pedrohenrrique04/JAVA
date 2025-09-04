public class Gerente extends Funcionario{

    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public double calcularBonus() {
        return this.getSalario() * 0.2;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return this.getNome()+" é uma gerente" +super.toString()+
                " do departamento de " + departamento  + " que recebe um bonus de R$ ";
    }
}
