package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {
        /*Servem para gerar casos especificos
        *objetivo: pedir para o usuario escolher entre os ninjas
        * */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolhaDoUsuario = scanner.nextInt();

        while (escolhaDoUsuario <1 || escolhaDoUsuario >3) {
            System.out.println("Opcao invalida, tente novamente!");
            System.out.println("Escolha um personagem: ");
            System.out.println("1 - Naruto Uzumaki");
            System.out.println("2 - Sasuke Uchiha");
            System.out.println("3 - Sakura Haruno");

            escolhaDoUsuario = scanner.nextInt();
        }

        switch (escolhaDoUsuario){
            case 1:
                System.out.println("O usuario escolheu Naruto Uzumaki.");
                break;
            case 2:
                System.out.println("O usuario escolheu Sasuke Uchiha.");
                break;
            case 3:
                System.out.println("O usuario escolheu Sakura Haruno.");
                break;
        }

        scanner.close();
    }
}
