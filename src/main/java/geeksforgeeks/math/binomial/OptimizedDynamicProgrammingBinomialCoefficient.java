package geeksforgeeks.math.binomial;

/**
 *
 *
 * Time Complexity: O(n*k), Auxiliary Space: O(k)
 *
 */
public class OptimizedDynamicProgrammingBinomialCoefficient {

	public int binomialCoefficient(int n, int k) {
		int C[] = new int[k + 1];

		C[0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = Math.min(i, k); j > 0; j--) {
				C[j] = C[j] + C[j - 1];
			}
		}

		return C[k];
	}
}
