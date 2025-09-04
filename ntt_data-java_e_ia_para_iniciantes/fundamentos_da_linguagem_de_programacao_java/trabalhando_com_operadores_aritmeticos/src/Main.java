import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ZonedDateTime agoraEmAlagoas = ZonedDateTime.now(ZoneId.of("America/Recife"));
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data e hora em Alagoas: " + agoraEmAlagoas.format(formatoBR));

        var scanner = new Scanner(System.in);

        System.out.println("informe o primeiro numero: ");
        var n = scanner.nextInt();

        System.out.println("informe o segundo numero: ");
        var n1 = scanner.nextInt();

        System.out.printf("%d + %d = %d\n", n, n1, n + n1);

        var value = 5 + 9 * 10 - 5 / 2;
        value += 10;
        System.out.println(value);

        System.out.println("informe o primeiro numero: ");
        var n3 = scanner.nextInt();

        System.out.printf("a raiz quadrada de %d e %.1f\n", n3, Math.sqrt(n3));

        System.out.printf("a potencia de %d e %.1f\n", n3, Math.pow(n3, 2));

        var value1 = 50;
        System.out.println(value1++);
        System.out.println(value1);
        System.out.println(++value1);

        var number = 1;
        var number1 = 1;
        var number2 = 2;

        System.out.println("digite ate onde iremos na seguencia de fibonacci: ");
        var number3 = scanner.nextInt();

        if (number3 > 0  && number3 == 1){

            System.out.println("seguencia de fibonacci: "+ number);

        } else if (number3 == 3) {

            System.out.println("seguencia de fibonacci: "+ number + number1 + number2);

        } else if (number3 > 3) {
            System.out.print(number + "\n" + number1 + "\n" + number2 + "\n");
            for (int i = 3; i < number3; ++i){
                number = number1 + number2;
                number1 = number2;
                number2 = number;
                System.out.println(number);
            }

        }else {
            System.out.println("voce digitou um numero menor que 1.");
        }

    }
}