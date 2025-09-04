public class Funcionario extends Pessoa{
    //atributos
    private String setor;
    private boolean trabalhando;

    //metodos publicos
    public void mudarTrabalho(){this.setTrabalhando(!this.trabalhando);}

    //metodos especiais
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
