package DesafiosIniciante;

import java.util.ArrayList;
import java.util.List;

public class Desafio1 {
    public static void main(String[] args) {
        List<Ninja> nijasDeKonoha = new ArrayList<>();
        Ninja ninja01 = new Ninja("pain attack","S+", "completed", "Naruto Uzumaki", 16);
nijasDeKonoha.add(ninja01);
        Ninja ninja02 = new Ninja("orochimaru attack","S+", "completed", "Kakashi Hataki", 32);
        nijasDeKonoha.add(ninja02);
        Ninja ninja03 = new Ninja("momoshike attack","S+", "completed", "Boruto Uzumaki", 10);
        nijasDeKonoha.add(ninja03);

        for (Ninja currentNinja: nijasDeKonoha){
            if(currentNinja.getAge() >= 15){
                currentNinja.setCompletionStatus("completed");
            } else if (currentNinja.getDifficultyLevel().toUpperCase().equals("C") || currentNinja.getDifficultyLevel().toUpperCase().equals("D")){
                currentNinja.setCompletionStatus("completed");
            } else {
                currentNinja.setCompletionStatus("not completed");
            }
            System.out.println(currentNinja.toString());
        }
    }
}