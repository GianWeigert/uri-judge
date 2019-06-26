import java.io.IOException;
import java.util.Scanner;

public class Main {
	static final double  SALARIES_VALUES[] = {400.00, 800.00, 1200.00, 2000.00};
	static final int  PERCENTAGE_INCREASE[] = {15, 12, 10, 7, 4};
	
	public static void main(String[] args) throws IOException{
		double salary = 0, salaryIncrease = 0;
		int index;
		Scanner scan = new Scanner(System.in);

		salary = scan.nextDouble();
		
		scan.close();

		index = getIndex(salary);
		salaryIncrease = (salary * PERCENTAGE_INCREASE[index]) / 100;
		
		System.out.printf(	
				"Novo salario: %.2f\nReajuste ganho: %.2f\nEm percentual: %d %s\n",
				(salary + salaryIncrease),
				salaryIncrease,
				PERCENTAGE_INCREASE[index],
				'%'
		);
	}
	
	public static int getIndex(double salary) {
		int i;
		
		for (i = 0; i < SALARIES_VALUES.length; i ++) {
			if (salary <= SALARIES_VALUES[i]) {
				return i;
			}
		}
		
		return i;
	}
}
