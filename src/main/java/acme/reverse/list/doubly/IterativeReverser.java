package acme.reverse.list.doubly;

import acme.reverse.api.Reverser2;

public class IterativeReverser implements Reverser2<Node> {

	public Node reverse(Node head, Node tail) {

		if (head == null || head.next == null) {
			return head;
		}

		// swap head and tail
		Node temp = head;
		head = tail;
		tail = temp;

		// traverse the list swapping prev and next fields of each node
		Node next = head;

		while (next != null) {
			temp = next.next;
			next.next = next.prev;
			next.prev = temp;
			next = next.next;
		}

		return head;
	}

}
