package acme.format.triangle;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class TriangleSolutionTest {

	private String input;
	private String expectedOutput;

	@Before
	public void setup() {
		//@formatter:off
		this.input =
			"4\n";
		//@formatter:on

		//@formatter:off
		this.expectedOutput =
			"   *\n" +
			"  ***\n" +
			" *****\n" +
			"*******\n";
		//@formatter:on
	}

	@Test
	public void test() throws IOException {

		// prepare i/o
		PrintStream originalStdout = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		System.setIn(new ByteArrayInputStream(input.getBytes("UTF-8")));
		System.setOut(ps);

		// execute the solution
		TriangleSolution.main(new String[] {});

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// set default system.out
		System.setOut(originalStdout);

		//
		System.out.println(output);

		// check results
		assertEquals(expectedOutput, output);
	}

}
