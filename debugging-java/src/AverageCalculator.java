import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculateClassroomAverage(alunos, scan);

        System.out.printf("Média da turma: %.2f", media);
    }

    public static double calculateClassroomAverage(String[] alunos, Scanner scan) {
        double sum = 0;

        for (String aluno : alunos) {
            System.out.println("Nota do aluno: " + aluno);
            double grade = scan.nextDouble();
            sum += grade;
        }

        return sum / alunos.length;
    }
}
