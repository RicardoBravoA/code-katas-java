package acme.data.reverse_doubly;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import acme.api.Reverser2;
import acme.data.reverse_doubly.Node;

public abstract class AbstractReverserTest {

	protected Reverser2<Node> reverser;

	Node head;
	Node tail;

	Node n1;
	Node n2;
	Node n3;
	Node n4;
	Node n5;

	@Before
	public void setup() {
		n1 = new Node("1", null, null);
		n2 = new Node("2", null, null);
		n3 = new Node("3", null, null);
		n4 = new Node("4", null, null);
		n5 = new Node("5", null, null);
	}

	public void reverse(final String reversedRepresentation, final Node head,
			final Node tail, final Reverser2<Node> reverser) {
		assertEquals(reversedRepresentation,
				listToString(reverser.reverse(head, tail)));
	}

	@Test
	public void nullString() {

		reverse(null, null, null, reverser);
	}

	@Test
	public void oneCharacter() {
		n1.next = null;
		n1.prev = null;

		head = n1;
		tail = null;

		reverse("1", head, tail, reverser);
	}

	@Test
	public void evenCharacters() {
		n1.next = n2;
		n2.next = null;

		n1.prev = null;
		n2.prev = n1;

		head = n1;
		tail = n2;

		reverse("21", head, tail, reverser);
	}

	@Test
	public void oddCharacters() {
		n1.next = n2;
		n2.next = n3;
		n3.next = null;

		n1.prev = null;
		n2.prev = n1;
		n3.prev = n2;

		head = n1;
		tail = n3;

		reverse("321", head, tail, reverser);
	}

	@Test
	public void fiveCharacters() {
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;

		n1.prev = null;
		n2.prev = n1;
		n3.prev = n2;
		n4.prev = n3;
		n5.prev = n4;

		head = n1;
		tail = n5;

		reverse("54321", head, tail, reverser);
	}

	private String listToString(final Node n) {
		if (n == null) {
			return null;
		}

		final StringBuilder sb = new StringBuilder();
		Node node = n;
		while (node.next != null) {
			sb.append(node.value);
			node = node.next;
		}
		sb.append(node.value);
		return sb.toString();
	}

}
