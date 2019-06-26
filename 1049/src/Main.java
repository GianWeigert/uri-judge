import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException{
		String animalType[] = new String[3];
		String animal;

		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 3; i ++) {
			animalType[i] = scan.nextLine();
		}

		scan.close();

		animal = getAnimal(animalType);
		
		System.out.println(animal);
	}
	
	public static String getAnimal(String[] animalType) {
		int indicies[] = new int[3];

		String animals[][][] = new String[2][4][4];
		animals[0][0][0] = "aguia";
		animals[0][0][1] = "pomba";
		animals[0][1][1] = "homem";
		animals[0][1][2] = "vaca";
		animals[1][2][3] = "pulga";
		animals[1][2][2] = "lagarta";
		animals[1][3][3] = "sanguessuga";
		animals[1][3][1] = "minhoca";

		
		for (int i = 0; i < 3; i ++) {
			indicies[i] = getIndex(animalType[i]);
		}
		
		return animals[indicies[0]][indicies[1]][indicies[2]];
	}
	
	public static int getIndex(String value) {
		HashMap<String, Integer> indices = new HashMap<String, Integer>();
		indices.put("vertebrado", 0);
		indices.put("invertebrado", 1);
		indices.put("ave", 0);
		indices.put("mamifero", 1);
		indices.put("inseto", 2);
		indices.put("anelideo", 3);
		indices.put("carnivoro", 0);
		indices.put("onivoro", 1);
		indices.put("herbivoro", 2);
		indices.put("hematofago", 3);
		
		return indices.get(value);
	}
}
