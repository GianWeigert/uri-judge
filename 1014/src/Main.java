import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		double distance, liters, kilometersPerLiter;
		Scanner scan = new Scanner(System.in);
		
		distance = scan.nextDouble();
		liters = scan.nextDouble();
		
		scan.close();
		
		kilometersPerLiter = distance / liters;
		
		System.out.printf("%.3f km/l\n", kilometersPerLiter);
	}
}
