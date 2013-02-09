package acme.substr;

public class CharArrayFindSubstring {

	public boolean find(String hay, String needle) {

		boolean foundIt = false;

		final int max = hay.length() - needle.length();

		test: for (int i = 0; i <= max; i++) {
			int n = needle.length();
			int j = i;
			int k = 0;
			while (n-- != 0) {
				if (hay.charAt(j++) != needle.charAt(k++)) {
					continue test;
				}
			}
			foundIt = true;
			break test;
		}
		return foundIt;
	}

}
