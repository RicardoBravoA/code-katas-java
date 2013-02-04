package com.acme.reverse.list.singly;

import com.acme.reverse.api.Reverser;

public class RecursiveReverser implements Reverser<Node> {

	public Node reverse(final Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		final Node nextItem = head.next;
		head.next = null;

		final Node reverseRest = reverse(nextItem);
		nextItem.next = head;
		return reverseRest;
	}

}