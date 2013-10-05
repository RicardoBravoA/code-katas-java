package acme.sort.quick;

import acme.sort.ArraySort;

public class DescendingArrayQuickSort implements ArraySort {
	private int[] n;

	@Override
	public int[] sort(int[] n) {
		if (n == null || n.length == 0) {
			return n;
		}

		this.n = n;
		quicksort(0, n.length - 1);
		return this.n;
	}

	private void quicksort(int low, int high) {
		int i = low, j = high;

		int pivot = n[low + (high - low) / 2];

		while (i <= j) {
			while (n[i] > pivot) {
				i++;
			}
			while (n[j] < pivot) {
				j--;
			}

			if (j >= i) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (low < j) {
			quicksort(low, j);
		}
		if (i < high) {
			quicksort(i, high);
		}
	}

	private void swap(int i, int j) {
		int temp = n[i];
		n[i] = n[j];
		n[j] = temp;
	}
}