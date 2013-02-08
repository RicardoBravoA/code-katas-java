package com.acme.trees;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinaryTreeDiameterTest {

	BinaryTreeDiameter diameter;

	Node n1;
	Node n2;
	Node n3;
	Node n4;
	Node n5;
	Node n6;
	Node n7;
	Node n8;
	Node n9;
	Node n10;
	Node n11;
	Node n12;
	Node n13;

	@Before
	public void setup() {
		diameter = new BinaryTreeDiameter();
		n1 = new Node(1);
		n2 = new Node(2);
		n3 = new Node(3);
		n4 = new Node(4);
		n5 = new Node(5);
		n6 = new Node(6);
		n7 = new Node(7);
		n8 = new Node(8);
		n9 = new Node(9);
		n10 = new Node(10);
		n11 = new Node(11);
		n12 = new Node(12);
		n13 = new Node(13);
	}

	@Test
	public void nullRoot() {
		assertEquals(0, diameter.diameter(null));
	}

	@Test
	public void onlyRoot() {
		assertEquals(1, diameter.diameter(n1));
	}

	@Test
	public void incompleteTreeHeightOf1() {
		n1.left = n2;

		assertEquals(2, diameter.diameter(n1));
	}

	/**
	 * <pre>
	 *            1
	 *           / \
	 *          2   3
	 * </pre>
	 */
	@Test
	public void fullTreeHeightOf1() {
		n1.left = n2;
		n1.right = n3;

		assertEquals(3, diameter.diameter(n1));
	}

	/**
	 * <pre>
	 *            1
	 *           / \
	 *          /   \
	 *         2     3
	 *        / \
	 *       4   5
	 * </pre>
	 */
	@Test
	public void incompleteTreeHeightOf2() {
		n1.left = n2;
		n1.right = n3;

		n2.left = n4;
		n2.right = n5;

		assertEquals(4, diameter.diameter(n1));
	}

	/**
	 * <pre>
	 *           1
	 *          /
	 *         2
	 *        / \
	 *       3   4
	 * </pre>
	 */
	@Test
	public void unbalancedTreeHeightOf2() {
		n1.left = n2;

		n2.left = n3;
		n2.right = n4;

		assertEquals(3, diameter.diameter(n1));
	}

	/**
	 * <pre>
	 *            1
	 *           / \
	 *          /   \
	 *         2     3
	 *        / \   / \
	 *       4   5 6   7
	 * </pre>
	 */
	@Test
	public void fullTreeHeightOf2() {
		n1.left = n2;
		n1.right = n3;

		n2.left = n4;
		n2.right = n5;

		n3.left = n6;
		n3.right = n7;

		assertEquals(5, diameter.diameter(n1));
	}

	/**
	 * <pre>
	 *            1
	 *           / \
	 *          2   3
	 *         / \   \
	 *        4   5   6
	 *           / \   \
	 *          7   8   9
	 *                 / \
	 *              10   11
	 *             / \
	 *           12   13
	 * </pre>
	 *
	 * Diameter is path from 8 to 12 (or 13)
	 */
	@Test
	public void diameterThroughRoot() {
		n1.left = n2;
		n1.right = n3;

		n2.left = n4;
		n2.right = n5;

		n3.right = n6;

		n5.left = n7;
		n5.right = n8;

		n6.right = n9;

		n9.left = n10;
		n9.right = n11;

		n10.left = n12;
		n10.right = n13;

		assertEquals(9, diameter.diameter(n1));
	}

}
