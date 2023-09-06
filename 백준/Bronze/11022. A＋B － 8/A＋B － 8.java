import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scann = new Scanner(System.in);
		int t;
		t = scann.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		int[] result = new int[t];
		
		
		for(int i=0; i<t; i++) {
			a[i] = scann.nextInt();
			b[i] = scann.nextInt();
		}
		
		for(int i=0; i<t; i++) {
			result[i] = a[i] + b[i];
			System.out.print("Case #"+(i+1)+": "+a[i]+" + "+b[i]+" = "+result[i]+"\n");
		}
	}
}
