package potd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromicNumberTest {

	PalindromicNumber palindromNumber = new PalindromicNumber();

	@Test
	public void isPalindromic() {
		assertTrue(palindromNumber.isPalindrom(0));
		assertTrue(palindromNumber.isPalindrom(1));
		assertTrue(palindromNumber.isPalindrom(11));
		assertTrue(palindromNumber.isPalindrom(111));
		assertTrue(palindromNumber.isPalindrom(121));
		assertTrue(palindromNumber.isPalindrom(1221));
		assertTrue(palindromNumber.isPalindrom(12321));
	}

	@Test
	public void isNotPalindromic() {
		assertFalse(palindromNumber.isPalindrom(-1));
		assertFalse(palindromNumber.isPalindrom(12));
		assertFalse(palindromNumber.isPalindrom(122));
		assertFalse(palindromNumber.isPalindrom(6221));
		assertFalse(palindromNumber.isPalindrom(52321));
	}

	@Test
	public void testDigits() {
		assertEquals(1, palindromNumber.digits(1));
		assertEquals(2, palindromNumber.digits(10));
		assertEquals(3, palindromNumber.digits(100));
	}

	@Test
	public void testDigitAtPos() {
		assertEquals(1, palindromNumber.digitAtPos(1, 1));
		assertEquals(1, palindromNumber.digitAtPos(12, 1));
		assertEquals(2, palindromNumber.digitAtPos(12, 2));
		assertEquals(1, palindromNumber.digitAtPos(123, 1));
		assertEquals(2, palindromNumber.digitAtPos(123, 2));
		assertEquals(3, palindromNumber.digitAtPos(123, 3));
		assertEquals(1, palindromNumber.digitAtPos(1234, 1));
		assertEquals(2, palindromNumber.digitAtPos(1234, 2));
		assertEquals(3, palindromNumber.digitAtPos(1234, 3));
		assertEquals(4, palindromNumber.digitAtPos(1234, 4));
	}

}
