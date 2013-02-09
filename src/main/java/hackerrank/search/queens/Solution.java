package hackerrank.search.queens;

import java.util.Scanner;

/**
 *
 * <h1>Queens Revised</h1>
 * <p>
 * Queens have always hated each other. Traditionally when queens were placed on
 * a chessboard a queen gets jealous of another if:
 *
 * <ul>
 * <li>They are both in the same row.
 * <li>They are both in the same column.
 * <li>They can see each other diagonally i.e lie in a line inclined 45 degrees
 * or 135 degrees to the base of board
 * </ul>
 *
 * But now the hatred has increased and the new condition is that no three of
 * them should lie in any straight line (this line need not be aligned 45
 * degrees or 135 degrees to the base of chess board).
 * <p>
 * The task before you is to place N queens on an N x N chess board so that none
 * of the earlier three conditions and the new condition is violated.
 *
 * <h2>Sample Example</h2>
 *
 * A valid configuration for N = 11 :
 *
 *
 * <pre>
 * * Q * * * * * * * * *
 *
 * * * * Q * * * * * * *
 *
 * * * * * * * Q * * * *
 *
 * Q * * * * * * * * * *
 *
 * * * * * * * * Q * * *
 *
 * * * * * * * * * * * Q
 *
 * * * * * Q * * * * * *
 *
 * * * Q * * * * * * * *
 *
 * * * * * * * * * Q * *
 *
 * * * * * * Q * * * * *
 *
 * * * * * * * * * * Q *
 * </pre>
 *
 * for N = 13
 *
 * <pre>
 * Q * * * * * * * * * * * *
 *
 * * * Q * * * * * * * * * *
 *
 * * * * * * * * * * * * Q *
 *
 * * * * * * * * * * Q * * *
 *
 * * * * * * * Q * * * * * *
 *
 * * Q * * * * * * * * * * *
 *
 * * * * * * * * * * * Q * *
 *
 * * * * * Q * * * * * * * *
 *
 * * * * * * * * Q * * * * *
 *
 * * * * * * * * * * * * * Q
 *
 * * * * * * * * * Q * * * *
 *
 * * * * Q * * * * * * * * *
 *
 * * * * * * Q * * * * * * *
 * </pre>
 *
 * So the output of your program should look something like this
 *
 * <pre>
 * 11
 *
 * 2 4 7 1 8 11 5 3 9 6 10
 * </pre>
 */
public class Solution {

	public static void main(String[] args) {

		// input
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();

		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = -1;
		}

		// logic
		int seed = 0;

		c[seed] = 0;

		for (int row = 1; row < c.length; row++) {
			int columnCandidate = 0;

			while (!(followsColumnRule(c, columnCandidate) && followsDiagonalRule(
					c, columnCandidate, row))) {
				columnCandidate++;
			}
			c[columnCandidate] = row;
		}

		// output
		System.out.println(n);
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i] + 1);
			if (i != c.length - 1) {
				System.out.print(" ");
			}

		}
		System.out.println();

		// cleanup
		in.close();
	}

	private static boolean followsColumnRule(int[] c, int columnCandidate) {
		return c[columnCandidate] == -1;
	}

	private static boolean followsDiagonalRule(int[] c, int columnCandidate,
			int currentRow) {
		if (currentRow <= 2) {
			return true;
		}

		for (int step = 1; step <= c.length / 4; step++) {
			int queenCount = 0;

			for (int r = 1; r < currentRow; r++) {
				if (columnCandidate - r * step >= 0
						&& c[columnCandidate - r * step] == currentRow - r) {
					queenCount++;
				}
				if (columnCandidate + r * step < c.length - 1
						&& c[columnCandidate + r * step] == currentRow - r) {
					queenCount++;
				}
				if (queenCount == 2) {
					return false;
				}
			}
		}
		return true;
	}

}
