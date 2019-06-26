import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		int valueA, valueB, valueC, valueD;
		String message = new String("Valores nao aceitos\n");
		boolean acceptedValues = true;
		Scanner scan = new Scanner(System.in);
		
		valueA = scan.nextInt();
		valueB = scan.nextInt();
		valueC = scan.nextInt();
		valueD = scan.nextInt();
		
		scan.close();
		
		acceptedValues = (valueB > valueC) && (valueD > valueA);
		acceptedValues = acceptedValues && ((valueC + valueD) > (valueA + valueB));
		acceptedValues = acceptedValues && ((valueC + valueD) > 0) && ((valueA + valueB) > 0); 
		acceptedValues = acceptedValues && (valueA % 2 == 0);	
		
		if (acceptedValues) {
			message = ("Valores aceitos\n");
		}
		
		System.out.print(message);
	}
}
