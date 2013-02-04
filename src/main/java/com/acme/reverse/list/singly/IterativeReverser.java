package com.acme.reverse.list.singly;

import com.acme.reverse.api.Reverser;

public class IterativeReverser implements Reverser<Node> {

	public Node reverse(final Node head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node left = head;
		Node middle = left.next;
		Node right = middle.next;

		left.next = null;

		while (right != null) {
			middle.next = left;

			left = middle;
			middle = right;
			right = right.next;
		}
		middle.next = left;

		return middle;
	}

}
