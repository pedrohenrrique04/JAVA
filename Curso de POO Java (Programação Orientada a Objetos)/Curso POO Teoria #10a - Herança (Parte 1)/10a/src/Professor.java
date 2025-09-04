public class Professor extends Pessoa{
    //atributos
    private String especialidade;
    private double salario;

    //metodos publicos
    public void receberAum(float aum){setSalario(this.salario += aum);}

    //metodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
