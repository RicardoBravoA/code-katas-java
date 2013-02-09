package acme.format.multiplication_table;

public class MultiplicationTable {

	public static void main(String[] args) {
		new MultiplicationTable().printLeftAligned(12);
		new MultiplicationTable().printRightAligned(12);
	}

	public void printLeftAligned(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println("");
		}

	}

	public void printRightAligned(int n) {

		for (int row = 1; row <= n; row++) {

			for (int column = 1; column <= n; column++) {
				final int maxColumnWidth = String.valueOf(column * n).length();
				System.out.print(String.format("%" + maxColumnWidth + "s ", row
						* column));
			}
			System.out.println("");
		}

	}

}
