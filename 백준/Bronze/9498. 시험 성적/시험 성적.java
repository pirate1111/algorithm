

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int score;

		score = scan.nextInt();

		if (score <= 100 & score >= 90) {
			System.out.println("A");

		} else if (score < 90 & score >= 80) {
			System.out.println("B");
		} else if (score < 80 & score >= 70) {
			System.out.println("C");
		} else if(score < 70 & score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
