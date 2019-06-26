import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int positiveNumbersQuantity = 0;
		double number, mediaValues = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 6; i ++) {
			number = scan.nextDouble();
			
			if (number > 0) {
				mediaValues = mediaValues + number;
				positiveNumbersQuantity ++;
			}
		}

		scan.close();
		mediaValues = mediaValues / positiveNumbersQuantity;

		System.out.printf(
				"%d valores positivos\n%.1f\n",
				positiveNumbersQuantity,
				mediaValues
		);
	}
}
