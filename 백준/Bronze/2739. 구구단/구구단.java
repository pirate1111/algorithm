import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int n, i, j, result;

		n = scann.nextInt();

			for (i = 1; i < 10; i++) {
				result = n * i;
				System.out.printf("%d * %d = %d \n", n, i, result);
			}
	}
}
