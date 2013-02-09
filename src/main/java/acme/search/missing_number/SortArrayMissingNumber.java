package acme.search.missing_number;

import java.util.Arrays;


public class SortArrayMissingNumber implements MissingNumber {

	public int find(int[] hay, final int n) {

		Arrays.sort(hay);

		for (int i = 1; i < hay.length; i++) {
			if (hay[i] - hay[i - 1] > 1) {
				return i+1;
			}
		}

		return -1;
	}
}
