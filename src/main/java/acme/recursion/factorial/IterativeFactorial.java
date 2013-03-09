package acme.recursion.factorial;

public class IterativeFactorial {

	public static int factorial(int n) {
		int result = 1;
		while (n > 1) {
			result *= n--;
		}
		return result;
	}

}
