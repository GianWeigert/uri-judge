import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		int ddd;
		String destination;

		Scanner scan = new Scanner(System.in);
		
		ddd = scan.nextInt();

		scan.close();

		destination = getDestination(ddd);
		
		System.out.println(destination);
	}

	public static String getDestination(int ddd) {
		HashMap<Integer, String> destinations = new HashMap<Integer, String>();
		destinations.put(61, "Brasilia");
		destinations.put(71, "Salvador");
		destinations.put(11, "Sao Paulo");
		destinations.put(21, "Rio de Janeiro");
		destinations.put(32, "Juiz de Fora");
		destinations.put(19, "Campinas");
		destinations.put(27, "Vitoria");
		destinations.put(31, "Belo Horizonte");
		
		if (destinations.get(ddd) == null) {
			return "DDD nao cadastrado";
		}
		
		return destinations.get(ddd);
	}
}
