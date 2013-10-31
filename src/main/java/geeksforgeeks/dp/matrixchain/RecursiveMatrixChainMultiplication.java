package geeksforgeeks.dp.matrixchain;

public class RecursiveMatrixChainMultiplication implements
		MatrixChainMultiplication {

	int[][] costMap;

	@Override
	public int matrixChainOrder(int[] matrices) {
		int length = matrices.length;
		costMap = new int[length][length];

		int result = matrixChainOrder(matrices, 1, matrices.length - 1);

		return result;
	}

	private int matrixChainOrder(int[] dimensions, int left, int right) {

		if (left == right) {
			costMap[left][right] = 0;
		} else {
			costMap[left][right] = Integer.MAX_VALUE;
			for (int k = left; k < right; k++) {

				// @formatter:off
				int cost = matrixChainOrder(dimensions, left, k)
						+ matrixChainOrder(dimensions, k + 1, right)
						+ dimensions[left - 1] * dimensions[k] * dimensions[right];
				// @formatter:on

				if (cost < costMap[left][right]) {
					costMap[left][right] = cost;
				}
			}
		}

		return costMap[left][right];
	}

}
