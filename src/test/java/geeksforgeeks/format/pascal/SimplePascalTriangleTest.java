package geeksforgeeks.format.pascal;

import static org.junit.Assert.assertEquals;

import geeksforgeeks.format.pascal.SimplePascalTriangle;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class SimplePascalTriangleTest {

	private String input;
	private String expectedOutput;

	@Test
	public void threeLevels() throws IOException {

		//@formatter:off
		this.input =
			"3";
		//@formatter:on

		//@formatter:off
		this.expectedOutput =
			"1\n" +
			"1 1\n" +
			"1 2 1\n";
		//@formatter:on

		// prepare i/o
		PrintStream originalStdout = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		System.setIn(new ByteArrayInputStream(input.getBytes("UTF-8")));
		System.setOut(ps);

		// execute the solution, give a seed
		SimplePascalTriangle.main(new String[] {});

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// set default system.out
		System.setOut(originalStdout);

		System.out.println(output);

		// check results
		assertEquals(expectedOutput, output);
	}
}
