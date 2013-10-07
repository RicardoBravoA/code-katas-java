package acme.strings.substring;

public class CharArrayIndexSubstring {

	public int find(String hay, String needle) {

		int needleLength = needle.length();
		int diffLength = hay.length() - needle.length();

		outer: for (int i = 0; i <= diffLength; i++) {
			for (int n = 0; n < needleLength; n++) {
				if (needle.charAt(n) != hay.charAt(i + n)) {
					continue outer;
				}
			}
			return i;
		}

		return -1;
	}

}
