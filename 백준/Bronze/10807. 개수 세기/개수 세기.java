import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int v, cnt=0;
		int[] list = new int[n];

		for (int i = 0; i < list.length; i++) {
			list[i] = scan.nextInt();
		}
		v = scan.nextInt();
		
		
		for (int i = 0; i < list.length; i++) {
			if (v == list[i]) {
				cnt = cnt+1;
			}
		}
		System.out.println(cnt);
	}
}