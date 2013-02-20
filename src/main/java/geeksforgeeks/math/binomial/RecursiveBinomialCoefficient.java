package geeksforgeeks.math.binomial;

/**
 * Following are common definition of Binomial Coefficients.
 * <ol>
 * <li>A binomial coefficient C(n, k) can be defined as the coefficient of X^k
 * in the expansion of (1 + X)^n.
 *
 * <li>A binomial coefficient C(n, k) also gives the number of ways,
 * disregarding order, that k objects can be chosen from among n objects; more
 * formally, the number of k-element subsets (or k-combinations) of an n-element
 * set.
 * </ol>
 *
 * Standard formula for Binomial Cofficients.
 *
 * <pre>
 * C(n, k) = C(n-1, k-1) + C(n-1, k)
 * C(n, 0) = C(n, n) = 1
 * </pre>
 *
 */
public class RecursiveBinomialCoefficient {

	public int binomialCoefficient(int n, int k) {
		if (k == 0 || k == n) {
			return 1;
		}

		return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
	}

}
