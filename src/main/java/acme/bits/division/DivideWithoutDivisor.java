package acme.bits.division;

public class DivideWithoutDivisor {

	public int divide(int dividend, int divisor) {

		if (dividend < divisor) {
			return 0;
		}
		if (dividend == divisor) {
			return 1;
		}

		// idea use integer long division in base-2

		int result = 0;

		int remainder = dividend;

		int myDivisor = divisor;
		int bitPos = 1;

		// shift divisor left
		while (myDivisor <= dividend) {
			myDivisor <<= 1;
			bitPos <<= 1;
		}

		while (bitPos != 0) {
			if (dividend >= myDivisor) {
				dividend = dividend - myDivisor;
				result |= bitPos;
			}
			bitPos >>= 1;
			myDivisor >>= 1;
		}
		return result;
	}

}
