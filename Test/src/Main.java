import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CepFormat cep = new CepFormat();
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite seu CEP: ");
        String defaultCep = scan.nextLine();

        String formattedCep;
        try {
            formattedCep = cep.formatCep(defaultCep);
        } catch (InvalidCepException e) {
            System.err.println("Formato de CEP inválido.");
            return;
        }

        System.out.println("CEP formatado: " + formattedCep);
    }
}