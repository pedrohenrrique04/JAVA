package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*Dados nao primitivos: String, Array, class, enum
        * Objetivo: criar um ninja e atribuir metodos*/

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();
        System.out.println("nome = " + nomeEmCaixaAlta);

        String aldeia = "Vila da folha";
        System.out.println("aldeia = " + aldeia.toLowerCase());
    }
}
