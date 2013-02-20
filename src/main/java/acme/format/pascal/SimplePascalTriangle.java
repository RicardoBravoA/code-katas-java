package acme.format.pascal;

import java.util.Scanner;

public class SimplePascalTriangle {

	public static void main(String[] args) {

		// input
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		// output
		for (int line = 0; line < n; line++) {
			int i = 0;
			while (i < line) {
				System.out.print(binomialCoeff(line, i++) + " ");
			}

			System.out.println(binomialCoeff(line, i));
		}

		// cleanup
		in.close();
	}

	private static int binomialCoeff(int n, int k) {
		int res = 1;
		if (k > n - k) {
			k = n - k;
		}
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

}
