import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();
		
		if (number % 2 == 0) {
			number ++;
		}

		for (int i = number; i <= (number + 10); i += 2) {			
			System.out.println(i);
		}
	}
}
