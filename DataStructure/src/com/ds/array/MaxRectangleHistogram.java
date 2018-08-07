package com.ds.array;

import java.util.Stack;

public class MaxRectangleHistogram {
	public int largestRectangleArea(int[] heights) {
		int maxArea = 0;
		Stack<Integer> stack = new Stack<>();

		int i = 0;
		while (i < heights.length) {

			if (stack.isEmpty() || heights[stack.peek()] <= heights[i]) {
				stack.push(i);
				i++;

			} else {
				int m = stack.pop();
				int tempArea = heights[m] * ((stack.isEmpty()) ? i  : i - 1 - stack.peek());
				if (tempArea > maxArea) {
					maxArea = tempArea;
				}
			}

		}
		while (!stack.isEmpty()) {
			int m = stack.pop();
			int tempArea = heights[m] * ((stack.isEmpty()) ? i  : i - 1 - stack.peek());
			if (tempArea > maxArea) {
				maxArea = tempArea;
			}
		}
		return maxArea;

	}

	public static void main(String[] args) {
		int arr[] = {9,0};
		int h = new MaxRectangleHistogram().largestRectangleArea(arr);
		System.out.println(h);

	}

}
