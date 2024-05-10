import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 0;

        while (true) {
            int opcao = scanner.nextInt();
            boolean exit = false;

            switch (opcao) {
                case 0:
                    System.out.println("Programa encerrado.");
                    exit = true;
                    break;
                case 1:
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;

                    break;
                case 2:
                    double valorSaque = scanner.nextDouble();

                    if (valorSaque > saldo) {
                        System.err.println("Saldo insuficiente");
                        break;
                    }

                    saldo -= valorSaque;
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);

                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

                    break;
            }

            if (exit) {
                break;
            }

            // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
        }
    }
}
