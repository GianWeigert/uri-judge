import java.util.Scanner;
import java.io.IOException;

public class Main {
	static final String STUDENT_APPROVED = "Aluno aprovado.";
	static final String STUDENT_FAILED = "Aluno reprovado.";
	static final String STUDENT_EXAMINATION = "Aluno em exame.";
	
	public static void main(String[] args) throws IOException{
		double notes[] = new double[4];
		double weight[] = {0.2, 0.3, 0.4, 0.1};
		double examNote = 0.0, media = 0.0;
		String message;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < notes.length; i ++) {
			notes[i] = scan.nextDouble();
		}
		
		for (int i = 0; i < notes.length; i ++) {
			media = media + (notes[i] * weight[i]);
		}
		
		message = studentSituation(media);
		System.out.printf("Media: %.1f\n", media);		
		System.out.println(message);
		
		if (message.equals(STUDENT_EXAMINATION)) {
			examNote = scan.nextDouble();
			System.out.printf("Nota do exame: %.1f\n", examNote);
			
			media = (media + examNote) / 2;
			message = studentSituationFinal(media);

			System.out.println(message);
			System.out.printf("Media final: %.1f\n", media);
		}
		
		scan.close();
	}
	
	private static String studentSituation(double media) {
		if (media >= 7.0) {
			return STUDENT_APPROVED;
		} else if (media < 5.0) {
			return STUDENT_FAILED;
		}
		
		return STUDENT_EXAMINATION;
	}
	
	private static String studentSituationFinal(double media) {
		if (media >= 5.0) {
			return STUDENT_APPROVED;
		}
		
		return STUDENT_FAILED;
	}
}
