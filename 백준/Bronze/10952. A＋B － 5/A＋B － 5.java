import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scann = new Scanner(System.in);
		int a, b;
		int result = 0;
		while (true) {
			a = scann.nextInt();
			b = scann.nextInt();
			if (a==0&&b==0) {
				break;
			}
			result = a + b;
			System.out.println(result);
		}
	}
}