public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //metodos publicos
    public String apresentar(){
        return "-------------------------------------------" +
                "\nChegou a hora! Apresentamos o lutador " + this.getNome() +
                "\n Diretamente de " + this.getNacionalidade() + "\n Com " + this.
                getIdade() + " anos e " + this.getAltura() + "\n pesando " + this.
                getPeso() + "Kg \n vitorias " + this.getVitorias() + "\n derrotas "
                + this.getDerrotas() + "\n empates " + this.getEmpates();
    }
    public String status(){
        return "-------------------------------------------\n " +
                this.getNome() + " e um peso " + this.getCategoria() +
                "\n ganhou " + this.getVitorias() + " vezes" +
                "\n perdeu " + this.getDerrotas() + " vezes" +
                "\n empatou " + this.getEmpates() + " vezes" ;
    }
    public void ganharLuta(){this.setVitorias(this.getVitorias() + 1);}
    public void perderLuta(){this.setDerrotas(this.getDerrotas() + 1);}
    public void empatarLuta(){this.setEmpates(this.getEmpates() + 1);}


    //metodos especiais
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso <52.2){
            this.categoria = "invalido!";
        } else if (this.peso <= 70.3) {
            this.categoria = "leve";
        } else if (this.peso <= 83.9) {
            this.categoria = "medio";
        } else if (this.peso <= 120.2) {
            this.categoria = "pesado";
        }else {
            this.categoria = "invalido!";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

}
