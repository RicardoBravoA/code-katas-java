package acme.search.missing_number;


public class BitsetMissingNumber implements MissingNumber {

	public int find(final int[] hay, final int n) {
		final boolean[] bitset = new boolean[n];
		for (final int i : hay) {
			bitset[i - 1] = true;
		}

		for (int i = 0; i < bitset.length; i++) {
			if (bitset[i] == false) {
				return i + 1;
			}
		}

		throw new IllegalArgumentException("GuruMeditationError");
	}

}
