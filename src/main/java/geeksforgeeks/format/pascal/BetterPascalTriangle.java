package geeksforgeeks.format.pascal;

import java.util.Scanner;

/**
 * O(n^2) time and O(1) extra space
 *
 * We know that ith entry in a line number line is Binomial Coefficient C(line,
 * i) and all lines start with value 1. The idea is to calculate C(line, i)
 * using C(line, i-1). It can be calculated in O(1) time using the following.
 *
 * <pre>
 * C(line, i)   = line! / ( (line-i)! * i! )
 * C(line, i-1) = line! / ( (line - i + 1)! * (i-1)! )
 * </pre>
 *
 * We can derive following expression from above two expressions.
 *
 * <pre>
 * C(line, i) = C(line, i - 1) * (line - i + 1) / i
 * </pre>
 *
 * So C(line, i) can be calculated from C(line, i-1) in O(1) time
 *
 */
public class BetterPascalTriangle {

	public static void main(String[] args) {

		// input
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		// output
		for (int line = 1; line <= n; line++) {
			int coeffcient = 1;
			int i = 1;
			while (i < line) {
				System.out.print(coeffcient + " ");
				coeffcient = coeffcient * (line - i) / i;
				i++;
			}
			// last coefficient is always 1
			System.out.println("1");
		}

		// cleanup
		in.close();
	}
}
