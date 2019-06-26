import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		for (int i = 1; i < 10; i += 2) {
			for (int j = (i + 6); j > (i + 3); j--) {
				System.out.printf("I=%d J=%d\n", i, j);
			}
		}
	}
}
