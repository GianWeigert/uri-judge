import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		double value;
		String message = new String("Fora de intervalo\n");
		Scanner scan = new Scanner(System.in);
		
		value = scan.nextDouble();
		
		scan.close();
		
		if (value >= 0 && value <= 25) {
			message = "Intervalo [0,25]\n";
		} else if (value > 25 && value <= 50 ) {
			message = "Intervalo (25,50]\n";
		} else if (value > 50 && value <= 75) {
			message = "Intervalo (50,75]\n";
		} else if (value > 75 && value <= 100) {
			message = "Intervalo (75,100]\n";
		}

		System.out.print(message);
	}
}
