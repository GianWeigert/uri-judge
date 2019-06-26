import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		double x1, y1, x2, y2, distance;
		String point1, point2;
		
		point1 = scan.nextLine();
		point2 = scan.nextLine();
		
		scan.close();
		
		String coordinatesXY1[] = point1.split(" ");
		String coordinatesXY2[] = point2.split(" ");
		
		x1 = Double.parseDouble(coordinatesXY1[0]);
		y1 = Double.parseDouble(coordinatesXY1[1]);
		x2 = Double.parseDouble(coordinatesXY2[0]);
		y2 = Double.parseDouble(coordinatesXY2[1]);

		distance = Math.sqrt(
				((x2 - x1) * (x2 - x1)) + (y2 - y1) * (y2 - y1) 
		);

		System.out.printf("%.4f\n", distance);
	}
}
