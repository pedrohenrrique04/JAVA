import java.util.concurrent.atomic.AtomicInteger;

public class ContaBanco {

    private long numConta; //s
    private static AtomicInteger contador = new AtomicInteger(0); //s
    private String tipo;                //s
    private String nomeDono;           //s
    private double saldo;//s||n
    private boolean status;           //s


    public long getNumConta() {
        return numConta;
    }

    public void setNumConta(long numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public void setNomeDono(String nomeDono) {
        this.nomeDono = nomeDono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContaBanco() {
        this.setNumConta(contador.incrementAndGet());
        this.setStatus(false);
    }

    public String abrirConta() {

        this.setStatus(true);

        if (this.tipo.equals("CC")) {

            this.saldo = 50;

        } else if (this.tipo.equals("CP")) {

            this.saldo = 150;

        }

        return "Olá " + this.getNomeDono() + ", sua conta está aberta com saldo de R$" + this.saldo;

    }

    public String fecharConta(){

        if (this.saldo != 0){

            return "Erro! Saldo diferente de 0. Saldo R$: " + this.getSaldo() + ".";

        }else {

            this.setStatus(false);
            return"Ola " + this.getNomeDono() + " sua conta foi fechada.";

        }
    }

    public double sacar(double saque){

        if ( this.getSaldo() >= saque){
            saque = this.getSaldo() - saque;
            this.setSaldo(saque);
        }
        return saque;
    }

}
