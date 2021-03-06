package acme.format.triangle;

import java.util.Scanner;

public class TriangleSolution {

	public static void main(String[] args) {

		// input
		Scanner in = new Scanner(System.in);
		int height = in.nextInt();

		int maxLength = 2 * height - 1;
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < maxLength / 2 - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// cleanup
		in.close();
	}

}
