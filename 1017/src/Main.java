import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int hours, averageSpeed;
		double distance, liters;
		Scanner scan = new Scanner(System.in);
		
		hours = scan.nextInt();
		averageSpeed = scan.nextInt();
				
		scan.close();
		
		distance = averageSpeed * hours;
		liters = distance / 12;
		
		System.out.printf("%.3f\n", liters);
	}
}
