package acme.recursion.oddeven;

public class RecursiveIsEven {

	public boolean isEven(int i) {
		if (i == 0) {
			return true;
		}
		if (i == 1) {
			return false;
		}

		return isEven(i - 2);
	}

}
