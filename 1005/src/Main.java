import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		double numberOne, numberTwo, noteOne, noteTwo, average;
		Scanner scan = new Scanner(System.in);
		
		numberOne = scan.nextDouble();
		numberTwo = scan.nextDouble();
		scan.close();
		
		noteOne = numberOne * (3.5/11);
		noteTwo = numberTwo * (7.5/11);
		
		average = (noteOne + noteTwo);
		
		System.out.printf("MEDIA = %.5f\n", average);
	}
}
