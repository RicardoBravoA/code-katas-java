package acme.data.reverse_doubly;

import acme.api.Reverser2;

public class RecursiveReverser implements Reverser2<Node> {

	public Node reverse(final Node one, final Node tail) {
		if (one == null || one.next == null || one.next == tail) {
			return one;
		}
		final Node zero = one.prev;

		final Node two = one.next;
		one.next = two.next;
		one.prev = two;

		two.prev = zero;
		two.next = one;

		final Node reverseRest = reverse(one, tail);



		return reverseRest;
	}

}