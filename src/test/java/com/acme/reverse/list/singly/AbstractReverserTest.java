package com.acme.reverse.list.singly;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.acme.reverse.api.Reverser;
import com.acme.reverse.list.singly.Node;

public abstract class AbstractReverserTest {

	protected Reverser<Node> reverser;

	Node head;

	Node n1 = new Node("1", null);
	Node n2 = new Node("2", null);
	Node n3 = new Node("3", null);

	@Before
	public void setup() {
		n1 = new Node("1", null);
		n2 = new Node("2", null);
		n3 = new Node("3", null);
	}

	public void reverse(final String reversedRepresentation,
			final Node original, final Reverser<Node> reverser) {
		assertEquals(reversedRepresentation,
				listToString(reverser.reverse(original)));
	}

	@Test
	public void nullString() {
		reverse(null, null, reverser);
	}

	@Test
	public void oneCharacter() {
		n1.next = null;
		head = n1;

		reverse("1", head, reverser);
	}

	@Test
	public void evenCharacters() {
		n1.next = n2;
		n2.next = null;
		head = n1;

		reverse("21", head, reverser);
	}

	@Test
	public void oddCharacters() {
		n1.next = n2;
		n2.next = n3;
		n3.next = null;
		head = n1;

		reverse("321", head, reverser);
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
