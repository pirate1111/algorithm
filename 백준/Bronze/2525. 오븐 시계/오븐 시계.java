import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scann = new Scanner(System.in);

		int hour, minute, cook;

		hour = scann.nextInt();
		minute = scann.nextInt();
		cook = scann.nextInt();

		minute = minute + cook;

		if (minute >= 60) {
			hour = hour + (minute / 60);
			minute = minute - (60 * (minute / 60));

			if (hour > 24) {
				hour = hour-24;
				System.out.printf("%d %d", hour, minute);
			} else if (hour == 24) {
				hour = 0;
				System.out.printf("%d %d", hour, minute);
			} else {
				System.out.printf("%d %d", hour, minute);
			}
		} else {
			System.out.printf("%d %d", hour, minute);

		}

	}

}