package acme.trees.traversal;

public class BFSPostOrderTraversal {

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
		if (node.right != null) {
			traverse(node.right);
		}
	}

	private void postOrder(Node node) {
		System.out.print(node.value);
	}

}
