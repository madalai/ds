package com.ds.dynamicprogramming;

/**
 * https://leetcode.com/problems/maximal-rectangle/description/
 */
public class MaxRectangularArea {
	public int maximalRectangle(char[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int dpCol[][] = new int[m][n];
		// Popluate the colomn prefix sum matrix
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || matrix[i][j] == '0') {
					dpCol[i][j] = Integer.parseInt("" + matrix[i][j]);
				} else {
					dpCol[i][j] = dpCol[i - 1][j] + 1;
				}
			}
		}
		int ans = 0;
		for (int i = 0; i < m - 1; i++) {
			for (int k = i + 1; k < m; k++) {
				int cs = 0;
				for (int j = 0; j < n; j++) {
					int tmp = 0;
					if (i == 0) {
						tmp = dpCol[k][j];
					} else {
						tmp = dpCol[k][j] - dpCol[i - 1][j];
					}
					if (tmp == k - i + 1) {
						cs = cs + tmp;
					} else {
						cs = 0;
					}
					ans = Math.max(cs, ans);
				}

			}
		}
		return ans;
	}

	public static void main(String[] args) {
		char mat[][] ={{'1'}};
		System.out.println(new MaxRectangularArea().maximalRectangle(mat));
	}
}
