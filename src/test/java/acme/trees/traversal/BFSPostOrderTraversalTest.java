package acme.trees.traversal;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

import acme.trees.traversal.BFSPostOrderTraversal;

public class BFSPostOrderTraversalTest {

	@Test
	public void traverse() throws IOException {

		// prepare i/o
		PrintStream originalStdout = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		System.setOut(ps);

		// execute the solution
		BFSPostOrderTraversal traverseStrategy = new BFSPostOrderTraversal();
		traverseStrategy.traverse(TestObjects.tree());

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// check results
		assertEquals("acedbhigf", output);

		// set default system.out
		System.setOut(originalStdout);
	}
}
