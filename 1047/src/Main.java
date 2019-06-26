import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		int time[] = new int[4];
		int gameHours = 0, gameMinutes = 0;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i ++) {
			time[i] = scan.nextInt();
		}
		scan.close();

		gameHours = time[2] - time[0];
		if (time[0] >= time[2] && time[1] >= time[3]) {
			gameHours = (24 + time[2]) - time[0];
		}
		
		gameMinutes = time[3] - time[1];
		if (time[1] > time[3]) {
			gameMinutes = (60 + time[3]) - time[1];
			gameHours --;
		}
				

		System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", gameHours, gameMinutes);
	}
}
