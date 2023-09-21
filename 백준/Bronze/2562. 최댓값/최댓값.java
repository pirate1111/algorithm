import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		int[] list = new int[9];
		int max = 0;
		int seq = 0;

		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		
		for (int i=0; i<9; i++) {
			if (list[i] > max) {
				max = list[i];
				seq=i;
			}
		}

		System.out.println(max);
		System.out.println(seq+1);
	}
}
