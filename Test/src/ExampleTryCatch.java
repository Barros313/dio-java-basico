import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class ExampleTryCatch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Digite seu nome: ");
        String nome = scan.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = scan.nextLine();

        try {
            System.out.print("Digite sua idade: ");
            int idade = scan.nextInt();
        } catch (InputMismatchException e) {
            System.err.println("O campo idade precisa ser numérico");
            return;
        }

        try {
            System.out.print("Digite sua altura: ");
            double altura = scan.nextDouble();
        } catch (InputMismatchException e) {
            System.err.println("O campo altura precisa ser numérico no formato americano");
            return;
        }
    }
}
