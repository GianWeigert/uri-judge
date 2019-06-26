import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException{
		for (double i = 0; i <= 2; i += 0.2) {
			for (int j = 1; j < 4; j++) {
				System.out.printf("I=%.1f J=%.1f\n", i, (j + i));
			}
		}
	}
}
