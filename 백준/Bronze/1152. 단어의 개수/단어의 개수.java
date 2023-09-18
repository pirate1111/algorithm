import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner scan = new Scanner(System.in);

		String str = scan.nextLine();
		StringTokenizer st = new StringTokenizer(str," ");

		System.out.print(st.countTokens());
	}
}
