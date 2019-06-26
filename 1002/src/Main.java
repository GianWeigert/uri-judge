import java.io.IOException;
import java.util.Scanner;

public class Main {
	static final double PI = 3.14159;

	public static void main(String[] args) throws IOException{
		double radius, area;
		Scanner scan = new Scanner(System.in);
		radius = scan.nextDouble();
		
		area = 3.14159 * radius * radius; 
		
		scan.close();
	
		System.out.printf("A=%.4f\n", area);
	}
}
