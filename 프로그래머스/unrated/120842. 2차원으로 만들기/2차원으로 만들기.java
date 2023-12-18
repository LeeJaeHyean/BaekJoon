class Solution {
   public static int[][] solution(int[] num_list, int n) {
		int row = num_list.length / n;
		int[][] result = new int[row][n];

		int index = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < n; j++) {
				result[i][j] = num_list[index++];
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5, 6, 7, 8};
		int n = 2;
		int[][] result = solution(num_list, n);

		for (int i = 0; i < result.length; i++) {
			System.out.print("[");
			for (int j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j]);
				if (j < result[i].length - 1) {
					System.out.print(", ");
				}
			}
			System.out.print("]");
			if (i < result.length - 1) {
				System.out.print(" ");
			}
		}
	}
}