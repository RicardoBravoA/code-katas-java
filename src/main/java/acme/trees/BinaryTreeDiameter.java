package acme.trees;

public class BinaryTreeDiameter {

	public int diameter(Node root) {
		if (root == null) {
			return 0;
		}

		return Math.max(Math.max(diameter(root.left), diameter(root.right)),
				height(root.left) + height(root.right) + 1);
	}

	private int height(Node root) {
		if (root == null) {
			return 0;
		}

		if (root.left == null && root.right == null) {
			return 1;
		}

		return Math.max(height(root.left), height(root.right)) + 1;
	}

}
