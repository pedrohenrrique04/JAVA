import java.util.Scanner;

public class Main {

    private static String normalizar(String texto) {

        return texto.toUpperCase()
                .replaceAll("Ç", "C")
                .replaceAll("\\s+", "");

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBanco cliente1 = new ContaBanco();

        System.out.println("Para comecar nos informe o seu nome.");
        System.out.println("Nome: ");
        cliente1.setNomeDono(scanner.nextLine());

        System.out.printf("Ola %s voce gostaria de abrir uma conta hoje?\nSim/nao: ", cliente1.getNomeDono());
        String respostaPolar = normalizar(scanner.nextLine());

        if (respostaPolar.equals("SIM")){

            while (true) {

                System.out.println("Para prosseguir indique qual tipo de conta o senhor gostaria de estar abrindo hoje.\nCC (Conta corrente) ou CP (Conta poupanca): ");
                String tipo = normalizar(scanner.nextLine());

                if (tipo.equals("CONTACORRENTE") || tipo.equals("CC")) {

                    cliente1.setTipo("CC");
                    break;

                }else if (tipo.equals("CONTAPOUPANCA") || tipo.equals("CP")) {

                    cliente1.setTipo("CP");
                    break;

                }else {

                    System.out.println("Tipo de conta invalido! Tente novamente.");

                }

            }

            System.out.println(cliente1.abrirConta());

        }else {

            System.out.println("Obrigado pela atencao!");
            return;

        }

        int opcao;

        do{

            System.out.println("===== MENU =====");
            System.out.println("1 - mostrar saldo.");
            System.out.println("2 - depositar.");
            System.out.println("3 - sacar.");
            System.out.println("4 - fechar conta.");
            System.out.println("0 - sair.");

            opcao = scanner.nextInt();

            switch (opcao){

                case 1:

                    System.out.println("Olá "+ cliente1.getNomeDono() + " o seu saldo é de: R$" + cliente1.getSaldo()+ ".");
                    break;

                case 2:

                    System.out.println("Quanto o senhor gostaria de depositar hoje: ");
                    cliente1.setSaldo(scanner.nextInt() + cliente1.getSaldo());
                    System.out.println("Deposito realizado, agora seu saldo é de: R$ " + cliente1.getSaldo());
                    break;

                case 3:

                    System.out.println("Quanto o senhor gostaria de sacar hoje: ");
                    double saque = scanner.nextInt();
                    while (true){
                    if (cliente1.getSaldo() >= saque) {
                        cliente1.setSaldo(cliente1.sacar(saque));
                        System.out.println("Saque realizado no valor de: R$ " + saque + ", agora seu saldo é: " + cliente1.getSaldo());
                        break;
                    }
                        System.out.println("Valor do saque excede saldo da conta, tente novamente com um valor menor que  R$ " + cliente1.getSaldo() + ".");
                    }
                    break;

                case 4:

                    System.out.println(cliente1.fecharConta());
                    return;

                case 0:

                    System.out.println("Saindo...");
                    break;

                default:

                    System.out.println("Opção inválida!");
            }

        }while (opcao != 0);
        scanner.close();

    }

    // caso o cliente feche a conta ele nao podera mais realizar nenhuma operacao.
    // adicionar ao menu a opcao de criar conta.
    //adicionar a funcao de entrar em uma conta ja criada, onde o dono da conta ira entrar nela usando uma senha e guardar tudo no banco de dados.
}