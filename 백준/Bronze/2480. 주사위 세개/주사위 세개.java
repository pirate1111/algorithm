import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int a, b, c, reward;

		a = scann.nextInt();
		b = scann.nextInt();
		c = scann.nextInt();
		
		if (a==b && b==c) {
			reward = 10000 +(a*1000);
			System.out.println(reward);
		} else {
			if (a==b || b==c || c==a) {
				if (a==b) {
					reward = 1000+(a*100);
					System.out.println(reward);
				} else if (b==c) {
					reward = 1000+(b*100);
					System.out.println(reward);
				} else {
					reward = 1000+(c*100);
					System.out.println(reward);
				}
			} else {
				if (a > b && a > c) {
					reward = a*100;
					System.out.println(reward);
				} else if (b > a && b > c) {
					reward = b*100;
					System.out.println(reward);
				} else {
					reward = c*100;
					System.out.println(reward);
				}
				
			}
		}

	}

}
