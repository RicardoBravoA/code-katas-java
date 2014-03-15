package potd;

public class PalindromicNumber {

	public boolean isPalindrom(int number) {

		// no negative numbers allowed
		if (number < 0) {
			return false;
		}

		// every number with only one digit is palindrom by definition
		if (number < 10) {
			return true;
		}

		// every number ending with a zero can not be a palindrom
		if (number % 10 == 0) {
			return false;
		}

		// get the most significant digit
		int digits = digits(number);
		for (int i = 1; i <= digits / 2; i++) {
			if (digitAtPos(number, i) != digitAtPos(number, digits - i + 1)) {
				return false;
			}
		}
		return true;
	}

	public int digitAtPos(int number, int pos) {
		if (pos < 1) {
			throw new IllegalArgumentException("pos < 1");
		}

		if (number < 10) {
			return number;
		}

		int digits = digits(number);

		if (digits == pos) {
			return number % 10;
		}

		int powerOfTen = digits - pos;
		int nom = (int) Math.pow(10, powerOfTen);

		return (number / nom) % 10;
	}

	public int digits(int number) {
		return (int) Math.log10(number) + 1;
	}

}
