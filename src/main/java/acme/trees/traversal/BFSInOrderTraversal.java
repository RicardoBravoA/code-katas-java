package acme.trees.traversal;

public class BFSInOrderTraversal {

	public void traverse(Node root) {
		preOrder(root);
		inOrder(root);
		postOrder(root);
	}

	private void preOrder(Node node) {
		if (node.left != null) {
			traverse(node.left);
		}
	}

	private void inOrder(Node node) {
		System.out.print(node.value);
	}

	private void postOrder(Node node) {
		if (node.right != null) {
			traverse(node.right);
		}
	}

}
