package acme.search.highest_number;

import java.util.Arrays;

/**
 *
 * Given a number, find the next higher number which has the exact same set of
 * digits as the original number. For example: given 38276 return 38627
 *
 *
 */
public class NextHighestLongSameDigits {

	/**
	 * Starting from the right, you find the first pair-of-digits such that the
	 * left-digit is smaller than the right-digit. Let's refer to the left-digit
	 * by "digit-x". Find the smallest number larger than digit-x to the right
	 * of digit-x, and place it immediately left of digit-x. Finally, sort the
	 * remaining digits in ascending order - since they were already in
	 * descending order, all you need to do is reverse them (save for digit-x,
	 * which can be placed in the correct place in O(n)).
	 *
	 */
	public long find(long number) {

		final String s = String.valueOf(number);
		final int length = s.length();

		int min = -1;
		int minPos = -1;
		for (int i = 1; i < length; i++) {
			int left = Character.getNumericValue(s.charAt(i - 1));
			int right = Character.getNumericValue(s.charAt(i));
			if (right < left) {
				minPos = i;
				min = right;
				break;
			}
		}

		if (minPos == -1) {
			throw new IllegalArgumentException("No possible solution available");
		}

		int minNext = 9;
		int minNextPos = -1;
		for (int i = minPos + 1; i < length; i++) {
			int current = Character.getNumericValue(s.charAt(i));
			if (current > min && current <= minNext) {
				minNext = current;
				minNextPos = i;
			}
		}

		StringBuilder sb = new StringBuilder(s);
		sb.setCharAt(minPos, Character.forDigit(minNext, 10));
		sb.setCharAt(minNextPos, Character.forDigit(min, 10));

		char[] charArray = sb.substring(minPos + 1).toCharArray();
		Arrays.sort(charArray);
		sb.replace(minPos + 1, length, new String(charArray));

		return Long.valueOf(sb.toString());
	}
}
