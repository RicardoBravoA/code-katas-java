package acme.trees;

/**
 * The Nth Smallest Element in a Binary Tree
 * <p>
 * Write function that takes a binary tree and efficiently returns the Nth
 * smallest element.
 *
 * For example, if N=4, and the tree looks like:
 *
 * <pre>
 *     3
 *    / \
 *   2   5
 *  /   / \
 * 1   4   6
 * </pre>
 *
 * The function should return 4.
 *
 */
public class BinaryTreeNthSmallest {

	public int find(Node root, int n) {
		int count = n;
		int sizeOfLeftSubtree = 0;

		while (root != null) {

			sizeOfLeftSubtree = elementCount(root.left);

			if (sizeOfLeftSubtree + 1 == count) {
				return root.value;
			} else if (sizeOfLeftSubtree < count) {
				root = root.right;
				count -= sizeOfLeftSubtree + 1;
			} else {
				root = root.left;
			}
		}

		return -1;
	}

	public int elementCount(Node node) {
		if (node == null) {
			return 0;
		}

		return 1 + elementCount(node.left) + elementCount(node.right);

	}

}
