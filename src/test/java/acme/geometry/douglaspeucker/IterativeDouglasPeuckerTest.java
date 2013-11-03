package acme.geometry.douglaspeucker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import acme.geometry.Point;

public class IterativeDouglasPeuckerTest {

	private Point start;
	private Point end;
	private Point[] points;

	private double epsilon;

	@Before
	public void setup() {
		start = new Point(1, 3);
		final Point b = new Point(2, 4);
		final Point c = new Point(3, 2);
		final Point d = new Point(4, 4);
		final Point e = new Point(5, 2);
		final Point f = new Point(6, 4);
		end = new Point(7, 3);

		points = new Point[] { start, b, c, d, e, f, end };
		epsilon = 1;
	}

	@Test
	public void test() {
		IterativeDouglasPeucker dp = new IterativeDouglasPeucker();

		Point[] reducedPoints = dp.reduce(points, epsilon);
		assertTrue(reducedPoints.length == 2);
		assertEquals(start, reducedPoints[0]);
		assertEquals(end, reducedPoints[1]);
	}

}
