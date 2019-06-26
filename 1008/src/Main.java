import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int employeeNumber, hoursWorked;
		double valueHoursWorked, salary;
		Scanner scan = new Scanner(System.in);
		
		employeeNumber = scan.nextInt();
		hoursWorked = scan.nextInt();
		valueHoursWorked = scan.nextDouble();
		
		scan.close();
		
		salary = (hoursWorked * valueHoursWorked);
		
		System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n", employeeNumber, salary);
	}
}
