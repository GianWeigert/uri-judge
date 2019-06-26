import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		int numberOne, numberTwo, result;
		Scanner read = new Scanner(System.in);
		
		numberOne = read.nextInt();
		numberTwo = read.nextInt();
		read.close();

		result = numberOne + numberTwo;
		
		System.out.print("X = " + result + "\n");
	}
}
