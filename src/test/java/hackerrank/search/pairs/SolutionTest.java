package hackerrank.search.pairs;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Test;

public class SolutionTest {

	@Test
	public void test() throws IOException {

		//@formatter:off
		String input =
			"5 2\n" +
			"1 5 3 4 2";
		//@formatter:on

		//@formatter:off
		String expectedOutput =
			"3\n";
		//@formatter:on

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		PrintStream ps = new PrintStream(baos);

		System.setIn(new ByteArrayInputStream(input.getBytes("UTF-8")));
		System.setOut(ps);

		// execute the solution
		Solution.main(new String[] {});

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// check results
		assertEquals(expectedOutput, output);

	}
}
