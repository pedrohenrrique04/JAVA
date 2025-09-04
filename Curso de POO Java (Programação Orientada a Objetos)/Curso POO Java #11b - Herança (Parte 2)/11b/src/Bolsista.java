public class Bolsista extends Aluno{

    private float bolsa;

    public void renovarBolsa(){
        System.out.println("renovando bolda de " + this.getNome());
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " e bolsista! Pagamento da mensalidade facilitado.");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
