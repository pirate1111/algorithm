import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int result = 0;
		
		while (scan.hasNext()) {
			a = scan.nextInt();
			b = scan.nextInt();
			result = a + b;
			System.out.println(result);
		}
	}
}