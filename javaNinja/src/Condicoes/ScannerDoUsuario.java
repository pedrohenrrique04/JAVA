package Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    /*Scanner é um jeito de trazer o usuario para dentro da aplicacao
    *O usuario vai cria um nija e vamos validar os dados
    * */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do seu ninja: ");
        String nome = scanner.nextLine();
        System.out.println("O nome do seu ninja e: " + nome);

        System.out.println("Digite a idade do seu ninja: ");
        int idade = scanner.nextInt();
        System.out.println("A idade do seu ninja e: " + idade);

        if (idade>=18) {
            System.out.println("Seu ninja e maior de idade e pode sair da vila.");
        }else {
            System.out.println("seu ninja ainda e muito novo para sair da vila.");
        }

        scanner.close();
    }
}
