package potd;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClockHandsTest {

	@Test
	public void knownDegrees() {
		ClockHands clockHands = new ClockHands();

		assertEquals(90d, clockHands.angleBetweenHands(6, 00), 0);
		assertEquals(90d, clockHands.angleBetweenHands(18, 00), 0);
		assertEquals(7.75d, clockHands.angleBetweenHands(6, 17), 0);
		assertEquals(172.25d, clockHands.angleBetweenHands(18, 17), 0);
	}

}
