package acme.trees.traversal;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

import acme.trees.traversal.BFSInOrderTraversal;

public class BFSInOrderTraversalTest {

	@Test
	public void traverse() throws IOException {

		// prepare i/o
		PrintStream originalStdout = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		System.setOut(ps);

		// execute the solution
		BFSInOrderTraversal traverseStrategy = new BFSInOrderTraversal();
		traverseStrategy.traverse(TestObjects.tree());

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// check results
		assertEquals("abcdefghi", output);

		// set default system.out
		System.setOut(originalStdout);
	}
}
