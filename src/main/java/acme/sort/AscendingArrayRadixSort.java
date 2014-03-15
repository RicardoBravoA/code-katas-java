package acme.sort;

import java.util.ArrayList;

public class AscendingArrayRadixSort implements ArraySort {

	@Override
	public int[] sort(int[] numbers) {
		return radixSort(numbers, maxDigits(numbers));
	}

	private int maxDigits(int[] numbers) {
		int maxDigits = 0;
		for (int n : numbers) {
			int digits = (int) Math.log10(n) + 1;
			if (digits > maxDigits) {
				maxDigits = digits;
			}
		}
		return maxDigits;
	}

	@SuppressWarnings("unchecked")
	// will overwrite original array
	public int[] radixSort(int numbers[], int maxDigits) {
		int exponent = 1; // 10^0;

		for (int i = 0; i < maxDigits; i++) {
			ArrayList<Integer> bucketList[] = new ArrayList[10];
			for (int k = 0; k < 10; k++) {
				bucketList[k] = new ArrayList<>();
			}
			for (int j = 0; j < numbers.length; j++) {
				int number = (numbers[j] / exponent) % 10;
				bucketList[number].add(numbers[j]);
			}
			exponent *= 10;

			int index = 0;
			for (int k = 0; k <= 9; k++) {
				for (int num : bucketList[k]) {
					numbers[index] = num;
					index++;
				}
			}
		}

		return numbers;
	}

}
