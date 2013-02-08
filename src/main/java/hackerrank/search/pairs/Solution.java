package hackerrank.search.pairs;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		// input
		Scanner in = new Scanner(System.in);
		int n, k;
		n = in.nextInt();
		k = in.nextInt();

		int c[] = new int[n];
		for (int i = 0; i < n; i++) {
			c[i] = in.nextInt();
		}

		// logic
		Arrays.sort(c);
		int count = 0;
		int left = 0;
		int right = 1;

		while (right < n - 1) {
			while (c[right] < c[left] + k) {
				right++;
			}
			if (c[right] == c[left] + k) {
				count++;
			}
			left++;
		}

		// output
		System.out.println(count);

		// cleanup
		in.close();
	}
}
