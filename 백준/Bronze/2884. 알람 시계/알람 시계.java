import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int hour, minute;

		hour = scann.nextInt();
		minute = scann.nextInt();

		minute = minute - 45;

		if (minute >= 0) {

			System.out.printf("%d %d", hour, minute);

		} else {
			
			if (hour <= 0) {
				hour = 23;
				
			} else {
				
				hour = hour - 1;
			}
			minute = minute+60;
			System.out.printf("%d %d", hour, minute);
		}
		

	}

}