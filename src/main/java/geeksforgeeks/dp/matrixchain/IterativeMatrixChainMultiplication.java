package geeksforgeeks.dp.matrixchain;

public class IterativeMatrixChainMultiplication implements
		MatrixChainMultiplication {

	int[][] costs;
	String[][] output;

	@Override
	public int matrixChainOrder(int[] dimensions) {
		int numberOfMatrices = dimensions.length - 1;

		// initialize costs
		costs = new int[numberOfMatrices][numberOfMatrices];

		// initialize output
		output = new String[numberOfMatrices][numberOfMatrices];
		for (int i = 0; i < numberOfMatrices; ++i) {
			output[i][i] = Character.toString((char) (i + 65));
		}

		int result = matrixChainOrder(dimensions, numberOfMatrices);

		System.out.println(output[0][numberOfMatrices - 1]);

		return result;
	}

	private int matrixChainOrder(int[] dimensions, int numberOfMatrices) {

		for (int width = 1; width < numberOfMatrices; width++) {
			for (int left = 0; left < numberOfMatrices - width; left++) {
				int right = left + width;
				costs[left][right] = Integer.MAX_VALUE;

				for (int split = left; split < right; split++) {
					int cost = costs[left][split] + costs[split + 1][right]
							+ dimensions[left] * dimensions[split + 1]
							* dimensions[right + 1];

					if (cost < costs[left][right]) {
						output[left][right] = "(" + output[left][split]
								+ output[split + 1][right] + ")";
						costs[left][right] = cost;
					}
				}
			}
		}

		return costs[0][numberOfMatrices - 1];
	}

}
