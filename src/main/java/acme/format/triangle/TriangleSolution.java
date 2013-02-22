package acme.format.triangle;

import java.util.Scanner;

public class TriangleSolution {

	public static void main(String[] args) {

		// input
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();

		// logic
		int maxLength = (int) (Math.pow(2, height - 1) - 1);
		for (int i = 0; i < height; i++) {
			int j = 0;
			for (j = 0; j < maxLength / 2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// cleanup
		in.close();
	}

}
