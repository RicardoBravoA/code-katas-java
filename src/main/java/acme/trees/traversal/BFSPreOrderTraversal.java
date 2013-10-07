package acme.trees.traversal;

public class BFSPreOrderTraversal {

	public void traverse(Node root) {
		preOrder(root);

		inOrder(root);

		postOrder(root);
	}

	private void preOrder(Node node) {
		System.out.print(node.value);
	}

	private void inOrder(Node node) {
		if (node.left != null) {
			traverse(node.left);
		}
	}

	private void postOrder(Node node) {
		if (node.right != null) {
			traverse(node.right);
		}
	}

}
