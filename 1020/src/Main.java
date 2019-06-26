import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int years = 0, months = 0, days = 0;
		Scanner scan = new Scanner(System.in);
		
		days = scan.nextInt();
		scan.close();
		
		if (days >= 365) {
			years = days / 365;
			days = days - (years * 365);
		}
		
		if (days >= 30) {
			months = days / 30;
			days = days - (months * 30);
		}
		
		System.out.print(years + " ano(s)\n" + months + " mes(es)\n" + days + " dia(s)\n");
	}
}
