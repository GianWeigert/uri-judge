import java.util.Scanner;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		String part1, part2;
		double totalPart1, totalPart2, totalValue;
		Scanner scan = new Scanner(System.in);
		
		part1 = scan.nextLine();
		part2 = scan.nextLine();
		
		scan.close();
		
		String partValues1[] = part1.split(" ");
		String partValues2[] = part2.split(" ");
		
		totalPart1 = (Integer.parseInt(partValues1[1]) * Double.parseDouble(partValues1[2]));
		totalPart2 = (Integer.parseInt(partValues2[1]) * Double.parseDouble(partValues2[2]));
		totalValue = totalPart1 + totalPart2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalValue);
	}
}
