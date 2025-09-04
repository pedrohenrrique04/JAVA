import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
         String name = scanner.next();

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();

        System.out.printf("Ola %s sua idade e %s.\n", name, age);

        }
    }