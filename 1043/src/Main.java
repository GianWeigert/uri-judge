import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		double sizesSide[] = new double[3];
		double sizesSideCopy[] = new double[3];
		double perimeter, area;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < sizesSide.length; i ++) {
			sizesSide[i] = scan.nextDouble();
			sizesSideCopy[i] = sizesSide[i];
		}
		
		scan.close();
				
		if (isTriangle(sizesSideCopy)) {
			perimeter = sizesSide[0] + sizesSide[1] + sizesSide[2];
			System.out.printf("Perimetro = %.1f\n", perimeter);
		} else {
			area = ((sizesSide[0] + sizesSide[1]) / 2) * sizesSide[2];
			System.out.printf("Area = %.1f\n", area);
		}
	}
	
	public static boolean isTriangle(double[] sizesSide) {
		double aux;

		for (int i = 0; i < sizesSide.length - 1; i ++) {
			for(int j = i + 1; j < sizesSide.length; j ++) {
				if (sizesSide[i] > sizesSide[j]) {
					aux = sizesSide[j];
					sizesSide[j] = sizesSide[i];
					sizesSide[i] = aux;
				}
			}
		}
		
		if ((sizesSide[0] + sizesSide[1]) > sizesSide[2]) {
			return true;
		}
		
		return false;
	}
}
