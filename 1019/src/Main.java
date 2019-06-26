import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int hours = 0, minutes = 0, seconds = 0;
		Scanner scan = new Scanner(System.in);
		
		seconds = scan.nextInt();
		scan.close();
		
		if (seconds >= 3600) {
			hours = seconds / 3600;
			seconds = seconds - (hours * 3600);
		}
		
		if (seconds >= 60) {
			minutes = seconds / 60;
			seconds = seconds - (minutes * 60);
		}
		
		System.out.print(hours + ":" + minutes + ":" + seconds + "\n");
	}
}
