import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
        while (true) {
            double saque = scanner.nextDouble();

            if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            }

            limiteDiario -= saque;
            System.out.printf("Saque realizado. Limite restante: %.1f\n", limiteDiario);
        }
// TODO: Solicite ao usuário o valor do saque:


// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;


// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:


// TODO: Informe que o saque foi realizado e mostre o limite restante:


// Fechamos o Scanner para evitar vazamento de recursos:
        scanner.close();
    }
}