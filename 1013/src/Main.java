import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int value1, value2, value3, major;
		Scanner scan = new Scanner(System.in);
		
		value1 = scan.nextInt();
		value2 = scan.nextInt();
		value3 = scan.nextInt();

		scan.close();
		
		major = (value1 + value2 + Math.abs(value1 - value2)) / 2;
		major = (major + value3 + Math.abs(major - value3)) / 2;

		System.out.print(major + " eh o maior\n");
	}
}
