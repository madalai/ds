package com.ds.stack;

import java.util.Stack;

public class TrapRainWater {
	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
		System.out.println(trap(arr));
	}

	public static int trap(int[] height) {
		int n = height.length;
		Stack<Integer> lMax = new Stack<>();
		Stack<Integer> rMax = new Stack<>();

		int lArr[] = new int[n];
		int rArr[] = new int[n];

		for (int i = 0; i < n; i++) {
			lMax.push(Math.max(lMax.isEmpty() ? 0 : lMax.peek(), height[i]));
		}
		int i = n - 1;
		while (i >= 0) {
			lArr[i] = lMax.pop();
			i--;
		}

		for (int j = n - 1; j >= 0; j--) {
			rMax.push(Math.max(rMax.isEmpty() ? 0 : rMax.peek(), height[j]));
		}
		int j = 0;
		while (j < n) {
			rArr[j] = rMax.pop();
			j++;
		}

		int sum = 0;

		for (int k = 0; k < n; k++) {
			sum += Math.min(lArr[k] - height[k], rArr[k] - height[k]);
		}
		return sum;
	}
}
