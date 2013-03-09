package acme.recursion.factorial;

public class RecursiveFactorial {

	public static int factorial(int n) {
		return n == 0 ? 1 : n * factorial(n - 1);
	}

}
