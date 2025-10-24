package Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*If e Else - condicoes
         * Objetivos: Passar o ninja de nivel de acordo com o numero de missoes.
         * */

        //Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 10;
        boolean hokage = false;
        short numeroDeMissoes = 20;
        //se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank chunin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank jounin");
        } else {
            System.out.println("Rank Genin");
        }
    }
}
