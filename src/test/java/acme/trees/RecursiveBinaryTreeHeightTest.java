package acme.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import acme.trees.Node;
import acme.trees.RecursiveBinaryTreeHeight;

public class RecursiveBinaryTreeHeightTest {

	RecursiveBinaryTreeHeight height;

	Node n1;
	Node n2;
	Node n3;
	Node n4;

	@Before
	public void setup() {
		height = new RecursiveBinaryTreeHeight();
		n1 = new Node(1);
		n2 = new Node(2);
		n3 = new Node(3);
		n4 = new Node(4);
	}

	@Test
	public void nullRoot() {
		assertEquals(0, height.height(null));
	}

	@Test
	public void onlyRoot() {
		assertEquals(0, height.height(n1));
	}

	@Test
	public void balancedOne() {
		n1.left = n2;
		n1.right = n3;

		assertEquals(1, height.height(n1));
	}

	@Test
	public void heightOfTwo() {
		n1.left = n2;
		n1.right = n3;

		n3.left = n4;

		assertEquals(2, height.height(n1));

	}

}
