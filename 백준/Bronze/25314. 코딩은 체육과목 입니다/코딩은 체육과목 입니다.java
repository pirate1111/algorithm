import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int n, mok=0;
		
		n = scann.nextInt();
		
		String[] result = new String[mok];

		mok = n / 4;

		if (n == 4) {
			System.out.println("long int");
		} else {
			for (int i=0; i<mok; i++) {
				System.out.print("long ");
			}
			System.out.println("int");
		}
	}
}