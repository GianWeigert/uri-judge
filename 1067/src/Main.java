import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int number;
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		scan.close();

		for (int i = 1; i <= number; i ++) {			
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
	}
}
