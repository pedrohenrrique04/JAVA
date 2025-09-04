import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Quanto e 2 + 2? ");
        var result = scanner.nextInt();

        var isRigth = result == 4;
        System.out.printf("O resultado e 4, voce acertou? (%s).\n", isRigth);

        System.out.println("Quantos anos voce tem? ");
        var age = scanner.nextInt();

        System.out.println("Voce e emancipado? ");
        var emancipated = scanner.next().toUpperCase();
        var isEmancipated = emancipated.equals("SIM");
        scanner.nextLine();

        var canDrive = age >= 18 || (isEmancipated && age >= 16);

        System.out.printf("Voce pode dirigir? (%s)\n", canDrive);

        System.out.println("Digite seu cpf: \n");
        String cpf = scanner.nextLine().replaceAll("\\D","");

        System.out.println("Digite seu nome: \n");
        String name = scanner.nextLine().toUpperCase().replaceAll(" ", "");

        System.out.println("Seu cadastro foi concluido.");

    }
}