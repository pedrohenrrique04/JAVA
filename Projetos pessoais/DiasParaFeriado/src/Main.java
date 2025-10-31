import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DataAtual dataAtual = new DataAtual();
        AnoNovo anoNovo = new AnoNovo(dataAtual);
        Carnaval carnaval = new Carnaval(dataAtual);
        SextaFeiraSanta sextaFeiraSanta = new SextaFeiraSanta(dataAtual);
        Tiradentes tiradentes = new Tiradentes(dataAtual);
        DiaDoTrabalho diaDoTrabalho = new DiaDoTrabalho(dataAtual);
        CorpusChristi corpusChristi = new CorpusChristi(dataAtual);
        SeteDeSetembro seteDeSetembro = new SeteDeSetembro(dataAtual);
        NossaSenhoraAparecida nossaSenhoraAparecida = new NossaSenhoraAparecida(dataAtual);
        Finados finados = new Finados(dataAtual);
        ConscienciaNegra conscienciaNegra = new ConscienciaNegra(dataAtual);
        Natal natal = new Natal(dataAtual);

        int opcao;
        do {
            System.out.println("==========Escolha um feriado de 2026==========");
            System.out.println("#1 - Ano novo - 1º de janeiro - quinta-feira.");
            System.out.println("#2 - Carnaval - 16 e 17 de fevereiro - Segunda e terça, com a Quarta-feira de Cinzas opcional.");
            System.out.println("#3 - Sexta-feira Santa - 3 de abril.");
            System.out.println("#4 - Tiradentes - 21 de abril (terça-feira).");
            System.out.println("#5 - Dia do Trabalho - 1º de maio (sexta-feira).");
            System.out.println("#6 - Corpus Christi - 4 de junho (quinta-feira).");
            System.out.println("#7 - 7 de setembro (segunda-feira).");
            System.out.println("#8 - Dia de Nossa Senhora Aparecida - 12 de outubro (segunda-feira).");
            System.out.println("#9 - Finados - 2 de novembro (segunda-feira).");
            System.out.println("#10 - Dia da Consciência Negra - 20 de novembro (sexta-feira).");
            System.out.println("#11 - Natal - 25 de dezembro (sexta-feira).");
            System.out.println("0 - Sair.");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    System.out.println("Até a próxima e tenha um ótimo dia!");
                    break;
                case 1:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + anoNovo.quantosDiasFaltamAnoNovo() + " dias para o Ano Novo!");
                    System.out.println("======================================");
                    break;
                case 2:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + carnaval.quantosDiasFaltamCarnaval() + " dias para o Carnaval!");
                    System.out.println("======================================");
                    break;
                case 3:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + sextaFeiraSanta.quantosDiasFaltamSextaFeiraSanta() + " dias para a Sexta-feira Santa!");
                    System.out.println("======================================");
                    break;
                case 4:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + tiradentes.quantosDiasFaltamTiradentes() + " dias para Tiradentes!");
                    System.out.println("======================================");
                    break;
                case 5:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + diaDoTrabalho.quantosDiasFaltamDiaDoTrabalho() + " dias para o Dia do Trabalho!");
                    System.out.println("======================================");
                    break;
                case 6:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + corpusChristi.quantosDiasFaltamCorpusChristi() + " dias para Corpus Christi!");
                    System.out.println("======================================");
                    break;
                case 7:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + seteDeSetembro.quantosDiasFaltamSeteDeSetembro() + " dias para o Dia da Independência!");
                    System.out.println("======================================");
                    break;
                case 8:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + nossaSenhoraAparecida.quantosDiasFaltamNossaSenhoraAparecida() + " dias para Nossa Senhora Aparecida!");
                    System.out.println("======================================");
                    break;
                case 9:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + finados.quantosDiasFaltamFinados() + " dias para Finados!");
                    System.out.println("======================================");
                    break;
                case 10:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + conscienciaNegra.quantosDiasFaltamConscienciaNegra() + " dias para o Dia da Consciência Negra!");
                    System.out.println("======================================");
                    break;
                case 11:
                    System.out.println("======================================");
                    System.out.println("Faltam: " + natal.quantosDiasFaltamNatal() + " dias para o Natal!");
                    System.out.println("======================================");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}