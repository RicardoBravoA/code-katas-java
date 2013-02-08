package hackerrank.search.pairs;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;

public class PairsSolutionTest {

	private String input;
	private String expectedOutput;

	@Before
	public void setup() {
		//@formatter:off
		this.input =
			"5 2\n" +
			"1 5 3 4 2";
		//@formatter:on

		//@formatter:off
		this.expectedOutput =
			"3\n";
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
		Solution.main(new String[] {});

		// flush the output
		String output = baos.toString("UTF-8");
		ps.close();

		// check results
		assertEquals(expectedOutput, output);

		// set default system.out
		System.setOut(originalStdout);
	}

}
