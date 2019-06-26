import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int numberOne, numberTwo, numberThree, numberFour, difference;
		Scanner scan = new Scanner(System.in);
		
		numberOne = scan.nextInt();
		numberTwo = scan.nextInt();
		numberThree = scan.nextInt();
		numberFour = scan.nextInt();
		
		scan.close();
		
		difference = (numberOne * numberTwo) - (numberThree * numberFour);
		
		System.out.print("DIFERENCA = " + difference + "\n");
	}
}
