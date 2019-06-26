import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		double products[] = {4.00, 4.50, 5.00, 2.00, 1.50};
		String productQuantity[] = new String[2];
		String product;
		double value;
		int productCode, quantity;
		Scanner scan = new Scanner(System.in);
		
		product = scan.nextLine();
		
		scan.close();
		
		productQuantity = product.split(" ");
		
		productCode = Integer.parseInt(productQuantity[0]) - 1;
		quantity =  Integer.parseInt(productQuantity[1]);
		
		value =  products[productCode] * quantity;

		System.out.printf("Total: R$ %.2f\n", value);
	}
}
