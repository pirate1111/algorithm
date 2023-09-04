import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int total, count;
		int result=0;
		total = scann.nextInt();
		count = scann.nextInt();
		
		int[] cost = new int[count]; 
		int[] cnt = new int[count];
		
		for (int i=0; i<count; i++) {
			cost[i] = scann.nextInt();
			cnt[i] = scann.nextInt();
		}
		
		for (int i=0; i<count; i++) {
			result = result + (cost[i]*cnt[i]);
		}
		
		if (total == result) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}