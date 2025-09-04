public class Pato implements Nadar, Voar{

    private int comida;
    private int cansaco;
    private boolean acordado;
    private boolean nadar;
    private boolean voar;

    public Pato() {
        this.comida = 50;
        this.cansaco = 50;
        this.acordado = true;
        this.nadar = false;
        this.voar = false;
    }

    public int getComida() {
        return comida;
    }

    public void setComida(int comida) {
        this.comida = comida;
    }

    public int getCansaco() {
        return cansaco;
    }

    public void setCansaco(int cansaco) {
        this.cansaco = cansaco;
    }

    public boolean isAcordado() {
        return acordado;
    }

    public void setAcordado(boolean acordado) {
        this.acordado = acordado;
    }

    public boolean isNadar() {
        return nadar;
    }

    public void setNadar(boolean nadar) {
        this.nadar = nadar;
    }

    public boolean isVoar() {
        return voar;
    }

    public void setVoar(boolean voar) {
        this.voar = voar;
    }

    @Override
    public void nadando() {
        if (this.isNadar()){
            this.setNadar(false);
        System.out.println("O pato parou de nadar.");
        }else {
            this.setNadar(true);
            System.out.println("O pato entrou na agua e comecou a nadar");
        }
    }

    @Override
    public void voando() {
        if (this.isVoar()){
            this.setVoar(false);
            System.out.println("O pato estava voando porem parou.");
        }else {
            this.setVoar(true);
            System.out.println("O pato se assustou e saiu voando.");
        }
    }

    public String status(){
        return "O pato esta dormindo? " + this.isAcordado() + "\n O pato esta com quanto de fome? " + this.getComida() +
                "\n O pato esta cansado? " + this.getCansaco();
    }
}
