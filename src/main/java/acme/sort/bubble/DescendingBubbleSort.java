package acme.sort.bubble;

import acme.sort.Sort;

public class DescendingBubbleSort implements Sort {

	@Override
	public int[] sort(int[] n) {
		boolean swapped = true;
		while (swapped) {
			swapped = false;
			for (int j = 0; j < n.length - 1; j++) {
				if (n[j] < n[j + 1]) {
					int t = n[j];
					n[j] = n[j + 1];
					n[j + 1] = t;
					swapped = true;
				}
			}
		}
		return n;
	}
}
