import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		double a, b, c, raiz1, raiz2, delta;
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		scan.close();
		
		if (a == 0) {
			System.out.print("Impossivel calcular\n");
			System.exit(0);
		}
		
		delta = (b * b) - (4 * a * c);

		if (delta < 0) {
			System.out.print("Impossivel calcular\n");
			System.exit(0);
		}
		
		raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
		raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("R1 = %.5f\nR2 = %.5f\n", raiz1, raiz2);
	}
}
