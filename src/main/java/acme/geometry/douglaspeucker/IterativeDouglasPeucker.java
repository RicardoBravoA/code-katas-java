package acme.geometry.douglaspeucker;

import acme.geometry.Point;

public class IterativeDouglasPeucker {

	int counter = 2;
	boolean[] marked;

	public Point[] reduce(Point[] points, double e) {
		marked = new boolean[points.length];
		marked[0] = true;
		marked[points.length - 1] = true;

		reduce(points, e, 0, points.length - 1);

		Point[] r = new Point[counter];

		int j = 0;
		for (int i = 0; i < marked.length; i++) {
			if (marked[i]) {
				r[j++] = points[i];
			}
		}

		return r;
	}

	private void reduce(Point[] points, double e, int left, int right) {
		marked[left] = true;
		marked[right] = true;

		double maxDistance = Double.NEGATIVE_INFINITY;
		int maxPos = -1;
		for (int i = left; i < right; i++) {
			double d = distance(points[left], points[right], points[i]);
			if (d > e) {
				if (d > maxDistance) {
					maxDistance = d;
					maxPos = i;
				}
			}
		}

		if (maxPos > -1) {
			counter = counter + 1;
			marked[maxPos] = true;
			reduce(points, e, left, maxPos);
			reduce(points, e, maxPos, right);
		}
	}

	private double distance(Point s, Point e, Point p) {
		double nom = Math.abs((e.x - s.x) * (s.y - p.y) - (s.x - p.x)
				* (e.y - s.y));
		double denom = Math.sqrt((e.x - s.x) * (e.x - s.x) + (e.y - s.y)
				* (e.y - s.y));

		return nom / denom;
	}

}
