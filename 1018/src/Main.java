import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int value, valueCopy;
		int banknotesQuantity[] = new int[7];
		int banknotesValues[] = {100, 50, 20, 10, 5, 2, 1};
		Scanner scan = new Scanner(System.in);
		
		value = scan.nextInt();
		valueCopy = value;
		scan.close();
		
		for(int i = 0; i < banknotesValues.length; i++) {
			banknotesQuantity[i] = valueCopy / banknotesValues[i];
			valueCopy = valueCopy - (banknotesValues[i] * banknotesQuantity[i]);
		}
		
		System.out.print(value + "\n");
		for(int i = 0; i < banknotesValues.length; i++) {
			System.out.print(banknotesQuantity[i] + " nota(s) de R$ " + banknotesValues[i] + ",00\n");
		}
	}
}
