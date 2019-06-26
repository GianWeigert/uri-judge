import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		int distance,travelledDistance = 0, minutes = 0;
		Scanner scan = new Scanner(System.in);
		
		distance = scan.nextInt();
		
		scan.close();
		
		while (travelledDistance < distance) {
			travelledDistance += 1;
			minutes += 2;
		}
		
		System.out.print(minutes + " minutos\n");
	}
}
