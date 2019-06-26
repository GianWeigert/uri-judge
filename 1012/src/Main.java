import java.util.Scanner;
import java.io.IOException;

public class Main {
	static final double PI = 3.14159; 
	public static void main(String[] args) throws IOException{
		double valueA, valueB, valueC, triangle, circle, trapeze, square, rectangle; 
		Scanner scan = new Scanner(System.in);
		
		valueA = scan.nextDouble();
		valueB = scan.nextDouble();
		valueC = scan.nextDouble();
		
		scan.close();
		
		triangle = (valueA * valueC) / 2;
		circle =  PI * valueC * valueC;
		trapeze = ((valueA + valueB) * valueC) / 2;
		square = valueB * valueB;
		rectangle = valueA * valueB;
		
		System.out.printf(
			"TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n",
			triangle,
			circle,
			trapeze,
			square,
			rectangle
		);	
	}
}
