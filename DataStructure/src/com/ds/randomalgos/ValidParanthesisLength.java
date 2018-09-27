package com.ds.randomalgos;

import java.util.Stack;

public class ValidParanthesisLength {

	public int longestValidParentheses(String s) {
		if (s == null || s.length() == 0) {
			return 0;
		}

		Stack<Integer> stack = new Stack<>();
		char arr[] = s.toCharArray();
		int n = arr.length;
		int longest = 0;

		for (int i = 0; i < n; i++) {

			if (s.charAt(i) == '(') {
				stack.push(i);
			} else {
				if (!stack.isEmpty()) {
					if (arr[stack.peek()] == '(') {
						stack.pop();
					} else {
						stack.push(i);
					}

				}
				else{
					stack.push(i);
				}
			}
		}

		if (stack.isEmpty()) {
			return n;
		}

		else {
			int a = n;
			int b = 0;

			while (!stack.isEmpty()) {
				b = stack.peek();
				stack.pop();
				longest = Math.max(longest, a - b - 1);
				a = b;
			}
			longest = Math.max(longest, a);
			return longest;
		}

	}

	public static void main(String[] args) {
		int n = new ValidParanthesisLength().longestValidParentheses(")()())((()))(((");
		System.out.println(n);
	}

}
