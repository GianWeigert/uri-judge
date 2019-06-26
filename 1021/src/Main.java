import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		double value;
		int valueInt, restValue;
		int banknotesQuantity[] = new int [6];
		int banknotesValues[] = {100, 50, 20, 10, 5, 2};
		int coinQuantity[] = new int[6]; 
		double coinValues[] = {1.00, 0.50, 0.25, 0.10, 0.05, 0.01};
		Scanner scan = new Scanner(System.in);
		
		value = scan.nextDouble();
		valueInt = (int) value;
		restValue = (int) ((value - valueInt) * 100);
		scan.close();
		
		for(int i = 0; valueInt >= 2; i ++) {
			banknotesQuantity[i] = valueInt / banknotesValues[i];
			valueInt = valueInt - (banknotesQuantity[i] * banknotesValues[i]);
		}
		
		restValue = restValue + (valueInt * 100);
		
		for(int i = 0; restValue > 0; i ++) {
			coinQuantity[i] = (int) (restValue / (coinValues[i] * 100));
			restValue = restValue - (int)(coinQuantity[i] * (coinValues[i] * 100));
		}

		System.out.print("NOTAS:\n");
		for (int i = 0; i < banknotesQuantity.length; i ++) {
			System.out.printf(
				"%d nota(s) de R$ %.2f\n",
				banknotesQuantity[i],
				(double) banknotesValues[i]
			);
		}
		System.out.print("MOEDAS:\n");
		for (int i = 0; i < coinQuantity.length; i ++) {
			System.out.printf(
				"%d moeda(s) de R$ %.2f\n",
				coinQuantity[i],
				(double) coinValues[i]
			);
		}
	}
}
