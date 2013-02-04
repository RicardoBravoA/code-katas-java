package com.acme.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeNthSmallestTest {

	BinaryTreeNthSmallest smallest;

	Node n1;
	Node n2;
	Node n3;
	Node n4;
	Node n5;
	Node n6;

	@Before
	public void setup() {
		smallest = new BinaryTreeNthSmallest();
		n1 = new Node(1);
		n2 = new Node(2);
		n3 = new Node(3);
		n4 = new Node(4);
		n5 = new Node(5);
		n6 = new Node(6);
	}

	@Test
	public void nullRoot() {
		assertEquals(-1, smallest.find(null, 4));
	}

	@Test
	public void onlyRoot() {
		assertEquals(1, smallest.find(n1, 1));
		assertEquals(-1, smallest.find(n1, 3));
	}

	@Test
	public void balancedExample() {
		n3.left = n2;
		n3.right = n5;

		n2.left = n1;
		n2.right = null;

		n5.left = n4;
		n5.right = n6;

		assertEquals(4, smallest.find(n3, 4));
	}

}
