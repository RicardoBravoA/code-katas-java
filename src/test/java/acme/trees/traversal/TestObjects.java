package acme.trees.traversal;

import acme.trees.traversal.Node;

public class TestObjects {

	public static Node tree() {
		Node a = new Node("a");
		Node b = new Node("b");
		Node c = new Node("c");
		Node d = new Node("d");
		Node e = new Node("e");
		Node f = new Node("f");
		Node g = new Node("g");
		Node h = new Node("h");
		Node i = new Node("i");

		Node root = f;
		f.left = b;
		f.right = g;
		b.left = a;
		b.right = d;
		d.left = c;
		d.right = e;

		g.right = i;
		i.left = h;

		return root;
	}

}
