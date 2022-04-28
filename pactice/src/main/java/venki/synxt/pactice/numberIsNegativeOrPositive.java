package venki.synxt.pactice;

import java.util.Scanner;

public class numberIsNegativeOrPositive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		System.out.println("Give a number: ");
		number = Integer.parseInt(sc.nextLine());

		if (number < 0) {
			System.out.println("Given number  is negative");
		}

		else {
			if (number > 0) {
				System.out.println("Given number is positive");
			} else {
				System.out.println("Given number is 0");
			}
		}
	}

}
