import com.mastersoft.clinical.model.Exame;
import com.mastersoft.clinical.service.ExameService;

public class Main {
    public static void main(String[] args) {

        Exame barrosExam = new Exame();

        barrosExam.id = 1;

        ExameService exameService = new ExameService();

        exameService.salvarExame(barrosExam);
    }
}