import java.util.Scanner;
import java.io.IOException;

public class Main {
	static final String ORIGIN = "Origem";
	static final String AXIS_X = "Eixo X";
	static final String AXIS_Y = "Eixo Y";
	static final String QUADRANT_1 = "Q1";
	static final String QUADRANT_2 = "Q2";
	static final String QUADRANT_3 = "Q3";
	static final String QUADRANT_4 = "Q4";
	
	public static void main(String[] args) throws IOException{
		double coordinates[] = new double[2];
		String message = new String();
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < coordinates.length; i ++) {
			coordinates[i] = scan.nextDouble();
		}
		
		scan.close();
		
		message = hasCoordinateEqualsZero(coordinates[0], coordinates[1]);
		
		if (message.isEmpty()) {
			message = whatIsQuadrant(coordinates[0], coordinates[1]);
		}
		
		System.out.print(message + "\n");
		
	}
	
	public static String hasCoordinateEqualsZero(double x, double y) {
		if (x == 0 && y == 0) {
			return ORIGIN;
		} else if (x == 0) {
			return AXIS_Y;
		} else if (y == 0) {
			return AXIS_X;
		}
		
		return "";
	}
	
	public static String whatIsQuadrant(double x, double y) {
		if (x > 0 && y > 0) {
			return QUADRANT_1;
		} else if (x < 0 && y > 0) {
			return QUADRANT_2;
		} else if (x < 0 && y < 0) {
			return QUADRANT_3;
		}
		
		return QUADRANT_4;
	}
}
