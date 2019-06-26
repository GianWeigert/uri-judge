import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		double numberOne, numberTwo, numberThree, noteOne, noteTwo, noteThree, average;
		Scanner scan = new Scanner(System.in);
		
		numberOne = scan.nextDouble();
		numberTwo = scan.nextDouble();
		numberThree = scan.nextDouble();
		
		scan.close();
		
		noteOne = numberOne * 0.2;
		noteTwo = numberTwo * 0.3;
		noteThree = numberThree * 0.5;
		
		average =  noteOne + noteTwo + noteThree;
		
		System.out.printf("MEDIA = %.1f\n", average);
	}
}
