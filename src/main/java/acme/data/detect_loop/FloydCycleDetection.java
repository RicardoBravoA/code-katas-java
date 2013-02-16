package acme.data.detect_loop;

public class FloydCycleDetection {

	public boolean hasLoop(Node first) {

		if (first == null) {
			return false;
		}

		// both start at first element
		Node turtle = first;
		Node hare = first;

		while (true) {
			turtle = turtle.next;
			if (hare.next == null) {
				hare = null;
			} else {
				hare = hare.next.next;
			}

			if (hare == null) {
				return false;
			}

			if (turtle == hare) {
				return true;
			}
		}
	}

}
