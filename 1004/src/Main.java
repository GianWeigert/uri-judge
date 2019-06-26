import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int multiplication, numberOne, numberTwo;
		Scanner scan = new Scanner(System.in);
		
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();
		
		multiplication = numberOne * numberTwo;
		
		scan.close();
		
		System.out.print("PROD = " + multiplication + "\n");
	}
}
