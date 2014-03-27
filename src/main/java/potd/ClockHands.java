package potd;

/**
 * Write a program to find the minimum angle between two hands on a 24 hour
 * clock. For instance, the angle at 6:00 is 90 degrees and the angle at 18:00
 * is also 90 degrees. At 6:17 the degree is 3.5 and at 18:17 it's 176.5 (hooray
 * for supplementary angles).
 *
 */
public class ClockHands {

	public double angleBetweenHands(String time) {
		String[] a = time.split(":");
		return angleBetweenHands(Integer.parseInt(a[0]), Integer.parseInt(a[1]));
	}

	public double angleBetweenHands(int hours, int minutes) {
		double hourHand = ((hours + minutes / 60d) * degreesPerSegment(24));
		double minuteHand = (minutes * degreesPerSegment(60));

		double angle = Math.abs(minuteHand - hourHand);

		return (angle > 180) ? angle - 180 : angle;
	}

	private double degreesPerSegment(int segments) {
		return 360 / segments;
	}

}
