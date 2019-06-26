import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		int numbers[] = new int[2];
		int result = 1;
		String message = new String("Nao sao Multiplos");
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < numbers.length; i ++) {
			numbers[i] = scan.nextInt(); 
		}
		
		scan.close();
		
		if (numbers[0] != 0) {
			result = numbers[1] % numbers[0];
		}
		
		if ((numbers[0] > numbers[1] || numbers[0] == 0) && numbers[1] != 0) {
			result = numbers[0] % numbers[1];
		}

		if (result == 0) {
			message =  "Sao Multiplos";
		}
		
		System.out.println(message);
	}
}
