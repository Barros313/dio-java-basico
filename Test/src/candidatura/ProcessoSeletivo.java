package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    static final double baseSalary = 2000;
    static final String[] candidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

    public static void main(String[] args) {
        printSelected();
    }

    static void printSelected() {
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");

        for (int i = 0; i < candidates.length; i++) {
            System.out.println("O candidato de número " + (i + 1) + " é o " + candidates[i]);
        }

        return;
    }

    static void selectCandidates () {

        int selectedCandidates = 0;
        int currentCandidate = 0;

        while (selectedCandidates < 5 && currentCandidate < candidates.length) {
            String candidate = candidates[currentCandidate];
            double intendedSalary = intendedValue();

            System.out.println("O candidato " + candidate + " requested this salary: " + intendedSalary);

            if (baseSalary >= intendedSalary) {
                System.out.println(candidate + " was selected");
                selectedCandidates++;
            }

            currentCandidate++;
        }
    }

    static double intendedValue() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analyzeCandidate (double intendedSalary) {

        if (baseSalary > intendedSalary) {
            System.out.println("Ligar para o candidato");
        } else if (baseSalary == intendedSalary) {
            System.out.println("Aguardando resultado dos demais candidatos");
        } else {
            System.out.println("Ligar para o candidato com contra proposta");
        }

    }
}
