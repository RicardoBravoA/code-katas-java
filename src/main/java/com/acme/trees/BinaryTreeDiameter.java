package com.acme.trees;

public class BinaryTreeDiameter {

	public int diameter(Node root) {
		if (root == null) {
			return 0;
		}

		int rootDiameter = height(root.left) + height(root.right) + 1;

		int leftDiameter = diameter(root.left);
		int rightDiameter = diameter(root.right);

		return Math.max(rootDiameter, Math.max(leftDiameter, rightDiameter));
	}

	private int height(Node root) {
		if (root == null) {
			return 0;
		}

		return Math.max(height(root.left), height(root.right)) + 1;
	}

}
