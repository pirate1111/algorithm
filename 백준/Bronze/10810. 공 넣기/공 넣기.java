import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] basket = new int[n];
		int ball;
		int start, end, goal;
		
		ball = scan.nextInt();
		
		for (int i=0; i<ball; i++) {
			start = scan.nextInt();
			end = scan.nextInt();
			goal = scan.nextInt();
			
			for (int j=(start-1); j<end; j++) {
				for (int k=0; k<goal; k++) {
					basket[j] = goal;
				}
			}
		}
		
		
		for (int k=0; k<n; k++) {
			System.out.print(basket[k]+" ");
		}
	}
}