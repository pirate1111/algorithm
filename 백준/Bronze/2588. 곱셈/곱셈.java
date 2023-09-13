import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);
		
		int a;
		int b;
		int c, d, e;
		int result=0;
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = (b%10);
		d = ((b/10)%10);
		e = (b/100);
		result = a*b;
		
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println(result);
	}
}