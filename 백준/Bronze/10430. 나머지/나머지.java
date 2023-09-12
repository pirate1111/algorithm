import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		int a, b, c;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		System.out.println((a+b)%c);
		System.out.println(((a%c)+(b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c)*(b%c))%c);
	}
}