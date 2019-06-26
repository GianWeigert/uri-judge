import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		int hours[] = new int[2];
		int gameHours = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < hours.length; i ++) {
			hours[i] = scan.nextInt(); 
		}
		
		scan.close();
		
		gameHours = 24 - hours[0] + hours[1];
		
		if (hours[0] < hours[1]) {
			gameHours = hours[1] - hours[0];
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)\n", gameHours);
	}
}
