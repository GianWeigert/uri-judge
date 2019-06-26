import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static final String IS_NOT_TRIANGLE = "NAO FORMA TRIANGULO";
	public static final String RIGHT_TRIANGLE = "TRIANGULO RETANGULO";
	public static final String ACUTANGULO_TRIANGLE = "TRIANGULO ACUTANGULO";
	public static final String OBTUSANGULO_TRIANGLE = "TRIANGULO OBTUSANGULO";
	public static final String EQUILATERAL_TRIANGLE = "TRIANGULO EQUILATERO";
	public static final String ISOSCELES_TRIANGLE = "TRIANGULO ISOSCELES";

	public static void main(String[] args) throws IOException{
		double sizesSide[] = new double[3];
		Scanner scan = new Scanner(System.in);
		String typeTriangle  = new String("");

		for (int i = 0; i < sizesSide.length; i ++) {
			sizesSide[i] = scan.nextDouble(); 
		}
		
		scan.close();
		
		typeTriangle = whatTriangle(sizesSide);
		
		System.out.println(typeTriangle);
		
		if (sizesSide[0] == sizesSide[1] && sizesSide[0] == sizesSide[2]) {
			System.out.println(EQUILATERAL_TRIANGLE);
		} else if ((sizesSide[0] == sizesSide[1]) || (sizesSide[0] == sizesSide[2]) || (sizesSide[1] == sizesSide[2])) {
			System.out.println(ISOSCELES_TRIANGLE);
		}
	}
	
	public static String whatTriangle(double[] sizesSide) {
		double aux;

		for (int i = sizesSide.length - 1; i > 0; i --) {
			for(int j = i - 1; j >= 0; j --) {
				if (sizesSide[i] > sizesSide[j]) {
					aux = sizesSide[j];
					sizesSide[j] = sizesSide[i];
					sizesSide[i] = aux;
				}
			}
		}
		
		if (!isTriangle(sizesSide)) {
			return IS_NOT_TRIANGLE;
		} else if (isRightTriangle(sizesSide)) {
			return  RIGHT_TRIANGLE;
		} else if (isAcutanguloTriangle(sizesSide)) {
			return ACUTANGULO_TRIANGLE;
		}
		
		return OBTUSANGULO_TRIANGLE;
	}
	
	public static boolean isTriangle(double[] sizesSide) {
		if ((sizesSide[1] + sizesSide[2]) > sizesSide[0]) {
			return true;
		}
		
		return  false;
	}
	
	public static boolean isRightTriangle(double[] sizesSide) {
		if (((sizesSide[1] * sizesSide[1]) + (sizesSide[2] * sizesSide[2])) == (sizesSide[0] * sizesSide[0])) {
			return true;
		}
		
		return  false;
	}
	
	public static boolean isAcutanguloTriangle(double[] sizesSide) {
		if (((sizesSide[1] * sizesSide[1]) + (sizesSide[2] * sizesSide[2])) > (sizesSide[0] * sizesSide[0])) {
			return true;
		}
		
		return  false;
	}
	
	public static boolean isObtusanguloTriangle(double[] sizesSide) {
		if (((sizesSide[1] * sizesSide[1]) + (sizesSide[2] * sizesSide[2])) < (sizesSide[0] * sizesSide[0])) {
			return true;
		}
		
		return  false;
	}
}
