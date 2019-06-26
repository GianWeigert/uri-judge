import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int pairNumbers = 0, oddNumbers = 0, positiveNumbers = 0, negativeNumbers = 0, number;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i ++) {
			number = scan.nextInt();
			
			if (number % 2 == 0) {
				pairNumbers ++;
			} else {
				oddNumbers ++;
			}
			
			if (number > 0) {
				positiveNumbers ++;
			}
			
			if (number < 0) {
				negativeNumbers ++;
			}
		}

		scan.close();

		System.out.printf(
			"%d valor(es) par(es)\n%d valor(es) impar(es)\n%d valor(es) positivo(s)\n%d valor(es) negativo(s)\n", 
			pairNumbers,
			oddNumbers,
			positiveNumbers,
			negativeNumbers
		);
	}
}
