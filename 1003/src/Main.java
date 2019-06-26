import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int numberOne, numberTwo, sum;
		Scanner scan = new Scanner(System.in);
		
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();
		
		sum = numberOne + numberTwo;
		
		scan.close();
		
		System.out.print("SOMA = " + sum + "\n");
	}
}
