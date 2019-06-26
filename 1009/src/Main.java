import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		double salary, salesValue, salaryWithBonus;
		Scanner scan = new Scanner(System.in);
		
		scan.nextLine();
		salary = scan.nextDouble();
		salesValue = scan.nextDouble();
		
		scan.close();
		
		salaryWithBonus = salary + (salesValue * 0.15);
		
		System.out.printf("TOTAL = R$ %.2f\n", salaryWithBonus);
	}
}
