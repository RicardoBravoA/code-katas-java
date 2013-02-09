package acme.reverse.list.doubly;

public class Node {

	String value;
	Node next;
	Node prev;

	public Node(final String value, final Node prev, final Node next) {
		this.value = value;
		this.prev = prev;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [" + (value != null ? "value=" + value : "") + "]";
	}

}