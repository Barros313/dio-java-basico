import java.util.Locale;
import java.util.Scanner;

public class InputFile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Insert height: ");
        double height = scan.nextDouble();

        System.out.println("Your height: " + height + "cm");
    }
}17
