import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		int values[] = new int[3];
		int valuesSorted[] = new int[3]; 
		int aux;
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < values.length; i ++) {
			values[i] = scan.nextInt(); 
			valuesSorted[i] = values[i];
		}
		
		scan.close();
		
		
		for (int i = 0; i < valuesSorted.length - 1; i ++) {
			for(int j = i + 1; j < valuesSorted.length; j ++) {
				if (valuesSorted[i] > valuesSorted[j]) {
					aux = valuesSorted[j];
					valuesSorted[j] = valuesSorted[i];
					valuesSorted[i] = aux;
				}
			}
		}
		
		for (int i = 0; i < valuesSorted.length; i ++) {
			System.out.printf("%d\n", valuesSorted[i]);
		}
		
		System.out.print("\n");
		
		for (int i = 0; i < values.length; i ++) {
			System.out.printf("%d\n", values[i]);
		}
	}
}
