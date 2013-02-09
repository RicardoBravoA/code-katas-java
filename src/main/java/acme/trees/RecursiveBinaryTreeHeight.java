package acme.trees;

/**
 * Longest Path in a Binary Tree
 * <p>
 * Write a function that takes as input a binary tree, and returns the length of
 * the longest path.
 *
 */
public class RecursiveBinaryTreeHeight {

	public int height(Node root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 0;
		}

		return Math.max(height(root.left), height(root.right)) + 1;
	}
}
