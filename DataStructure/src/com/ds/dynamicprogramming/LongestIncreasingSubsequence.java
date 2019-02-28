package com.ds.dynamicprogramming;

public class LongestIncreasingSubsequence {
	public static void main(String[] args) {
		int arr[] = {1,3,6,7,9,4,10,5,6};
		System.out.println(lis(arr));
	}
	public static  int lis(int arr[]) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int dp[] = new int[arr.length];
		dp[0] = 1;
		int ans = 0;
		for (int i = 1; i < arr.length; i++) {
			int max = 1;
			for (int j = i-1; j >= 0; j--) {
				if (arr[i] > arr[j]) {
					int val = dp[j] + 1;
					max = Math.max(val, max);
				}
			}
			dp[i] = max;
			ans = Math.max(ans, max);
		}
		return ans;
	}
}
