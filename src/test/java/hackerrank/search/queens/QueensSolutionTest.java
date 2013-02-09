package hackerrank.search.queens;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class QueensSolutionTest {

	private String input;
	private String expectedOutput;

	@Test
	public void nine() throws IOException {

		//@formatter:off
		this.input =
			"9";
		//@formatter:on

		//@formatter:off
		this.expectedOutput =
			"9\n" +
			"1 2 3 5 4 8 6 9 7\n";
		//@formatter:on

		// prepare i/o
		PrintStream originalStdout = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		System.setIn(new ByteArrayInputStream(input.getBytes("UTF-8")));
		System.setOut(ps);

		// execute the solution, give a seed
		Solution.main(new String[] {});

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// set default system.out
		System.setOut(originalStdout);

		prettyPrint(output);

		// check results
		assertEquals(expectedOutput, output);
	}

	@Test
	public void eleven() throws IOException {

		//@formatter:off
		this.input =
			"11";
		//@formatter:on

		//@formatter:off
		this.expectedOutput =
			"9\n" +
			"1 2 3 5 4 8 6 9 7\n";
		//@formatter:on

		// prepare i/o
		PrintStream originalStdout = System.out;
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		System.setIn(new ByteArrayInputStream(input.getBytes("UTF-8")));
		System.setOut(ps);

		// execute the solution, give a seed
		Solution.main(new String[] {});

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// set default system.out
		System.setOut(originalStdout);

		prettyPrint(output);

		// check results
		assertEquals(expectedOutput, output);
	}

	private static void prettyPrint(String output) {
		String[] c = output.split("[\\r\\n]+")[1].split("\\s+");

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length; j++) {
				if (Integer.valueOf(c[j]) == i + 1) {
					System.out.print("Q");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
