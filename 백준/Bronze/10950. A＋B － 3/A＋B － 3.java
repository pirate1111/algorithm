import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int T, A, B;
		T = scann.nextInt();
		int[] result = new int[T];

		for (int i = 0; i < T; i++) {
			A = scann.nextInt();
			B = scann.nextInt();
			result[i] = A + B;
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]+"\n");
		}
	}
}
