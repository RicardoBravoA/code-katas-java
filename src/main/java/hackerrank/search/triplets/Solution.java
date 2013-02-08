package hackerrank.search.triplets;

import java.util.Arrays;
import java.util.Scanner;

/**
 * There is an integer array d which does not contain more than two elements of
 * the same value. How many distinct ascending triples (d[i] < d[j] < d[k], i <
 * j < k) are present?
 *
 * <h1>Input format</h1> The first line contains an integer N denoting the
 * number of elements in the array. This is followed by a single line containing
 * N integers separated by a single space with no leading/trailing spaces
 *
 * <h1>Output format</h1> A single integer that denotes the number of distinct
 * ascending triples present in the array
 *
 * <h1>Constraints</h1> N <= 10^5 Every element of the array is present at most
 * twice Every element of the array is a 32-bit positive integer
 *
 * <h1>Sample input</h1> 6 1 1 2 2 3 4
 *
 * <h1>Sample output</h1> 4
 *
 * <h1>Explanation</h1> The distinct triplets are (1,2,3) (1,2,4) (1,3,4)
 * (2,3,4)
 *
 */
public class Solution {

	public static void main(String[] args) {

		// input
		Scanner in = new Scanner(System.in);
		int n;
		n = in.nextInt();

		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}

		// logic
		Arrays.sort(c);
		int result = 0;

		int left = 0;
		int middle;
		int right;

		// 1. left
		if (c[left] == c[left + 1]) {
			left++;
		}
		// 1. middle
		middle = left + 1;
		if (c[middle] == c[middle + 1]) {
			middle++;
		}
		// 1. right
		right = middle + 1;
		if (c[right] == c[right + 1]) {
			right++;
		}

		// lock positions
		result++;

		// move right to the end
		while (right < n - 1) {
			if (c[right] != c[right + 1]) {
				result++;
			}
			right++;
		}

		// move middle to before right
		while (middle + 1 < right) {
			if (c[middle] != c[middle + 1]) {
				result++;
			}
			middle++;
		}

		// move left to before middle
		while (left + 1 < middle) {
			if (c[left] != c[left + 1]) {
				result++;
			}
			left++;
		}

		// output
		System.out.println(result);

		// cleanup
		in.close();
	}
}
