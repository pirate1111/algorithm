import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[n];
		int min = 999999, max = 0;

		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}

		Arrays.sort(list);
		System.out.print(list[0] + " " + list[n-1]);
	}
}