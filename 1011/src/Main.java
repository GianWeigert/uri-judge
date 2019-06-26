import java.util.Scanner;
import java.io.IOException;

public class Main {
	static final double PI = 3.14159;
	public static void main(String[] args) throws IOException{
		double volume, radius;
		Scanner scan = new Scanner(System.in);
	
		radius = scan.nextDouble();
		
		volume = (4.0/3.0) * PI * (radius * radius * radius);
		
		scan.close();
		
		System.out.printf("VOLUME = %.3f\n", volume);
	}
}
