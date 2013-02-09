package acme.io.integers_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class JdkSumIntegerFile {

	public int sum(File file) throws IOException {
		final BufferedReader br = new BufferedReader(new FileReader(file));

		String line;
		int sum = 0;

		while ((line = br.readLine()) != null) {
			sum += Integer.valueOf(line);
		}
		br.close();

		return sum;
	}

}
