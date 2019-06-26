import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int pairNumbers = 0, number;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 5; i ++) {
			number = scan.nextInt();
			
			if (number % 2 == 0) {
				pairNumbers ++;
			}
		}

		scan.close();

		System.out.printf("%d valores pares\n", pairNumbers);
	}
}
