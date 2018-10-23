package com.ds.dynamicprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BinaryStringsWithNoAdjacent1 {
	static int dp0[];
	static int dp1[];
	static double M = 1e9 + 7;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		List<Integer> list = new ArrayList<>();
		int max = 0;
		for (int i = 0; i < t; i++) {
			int num = sc.nextInt();
			if (num > max) {
				max = num;
			}
			list.add(num);
		}
		helper(max);
		for (int n : list) {
			System.out.println((int) ((dp0[n] + dp1[n]) % M));
		}

	}

	public static int helper(int n) {
		dp0 = new int[n + 1];
		dp1 = new int[n + 1];
		dp0[0] = 0;
		dp1[0] = 0;
		if (n > 0) {
			dp0[1] = 1;
			dp1[1] = 1;
		}
		for (int i = 2; i <= n; i++) {
			dp0[i] = (int) ((dp0[i - 1] + dp1[i - 1]) % M);
			dp1[i] = (int) (dp0[i - 1] % M);
		}
		return (int) ((dp0[n] + dp1[n]) % M);

	}
}
