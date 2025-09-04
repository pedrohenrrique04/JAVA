public class Caneta {

    public String modelo;
    private double ponta;
    private String cor;
    private boolean tampado;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampado() {
        return tampado;
    }

    public void setTampado(boolean tampado) {
        this.tampado = tampado;
    }

    public Caneta(String modelo, double ponta, String cor) {
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.setCor(cor);
        this.setTampado(true);
    }

    public String tampar(){
        this.setTampado(true);
        return "A caneta " + getModelo() + " esta tampada? " + isTampado();
    }

    public String destampar(){
        this.setTampado(false);
        return "A caneta " + getModelo() + " esta tampada? " + isTampado();
    }
}
