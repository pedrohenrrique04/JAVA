public class Analista extends Funcionario{

    private String linguagem;

    public Analista(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public double calcularBonus() {
        return this.getSalario() * 0.15;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    @Override
    public String toString() {
        return this.getNome()+" é uma Analista " + super.toString()+
                " da linguagem " + linguagem + " que recebe um bonus de ";
    }
}
