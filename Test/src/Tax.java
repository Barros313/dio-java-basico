import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scan.nextDouble();

        System.out.println("Enter other benefits: ");
        double benefits = scan.nextDouble();

        scan.close();

        boolean firstTaxLevel = salary <= 1100;
        boolean secondTaxLevel = salary > 1100 && salary <= 2500;

        double taxValue;
        if (firstTaxLevel) {
            taxValue = salary * .05;
        } else if (secondTaxLevel) {
            taxValue = salary * .10;
        } else {
            taxValue = salary * .15;
        }

        double liquidCompensation = salary - taxValue + benefits;

        System.out.printf("Liquid compensation: %.2f", liquidCompensation);

    }
}
