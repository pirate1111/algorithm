import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int n, sum = 0;
		n = scann.nextInt();

		for (int i = 0; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}