package geeksforgeeks.math.binomial;

/**
 * See the following recursion tree for n = 5 an k = 2. The function C(3, 1) is
 * called two times. For large values of n, there will be many common
 * subproblems.
 *
 * <pre>
 *                              C(5, 2)
 *                     /                      \
 *            C(4, 1)                           C(4, 2)
 *             /   \                          /           \
 *        C(3, 0)   C(3, 1)             C(3, 1)               C(3, 2)
 *                 /    \               /     \               /     \
 *          C(2, 0)    C(2, 1)      C(2, 0) C(2, 1)          C(2, 1)  C(2, 2)
 *                    /        \              /   \            /    \
 *                C(1, 0)  C(1, 1)      C(1, 0)  C(1, 1)   C(1, 0)  C(1, 1)
 * </pre>
 *
 * Since same suproblems are called again, this problem has Overlapping
 * Subprolems property. So the Binomial Coefficient problem has both properties
 * (see this and this) of a dynamic programming problem. Like other typical
 * Dynamic Programming(DP) problems, recomputations of same subproblems can be
 * avoided by constructing a temporary array C[][] in bottom up manner.
 * Following is Dynamic Programming based implementation.
 *
 * <p>
 * Time Complexity: O(n*k), Auxiliary Space: O(n*k)
 *
 */
public class DynamicProgrammingBinomialCoefficient {

	public int binomialCoefficient(int n, int k) {
		int C[][] = new int[n + 1][k + 1];
		int i, j;

		// calculate bottom up
		for (i = 0; i <= n; i++) {
			for (j = 0; j <= Math.min(i, k); j++) {
				if (j == 0 || j == i) {
					C[i][j] = 1;
				} else {
					C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
				}
			}
		}

		return C[n][k];
	}
}
