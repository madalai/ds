package com.ds.randomalgos;

/**
 * for input n print all possible valid combination of brackets
 * 
 * @author madalai
 *
 */
public class BracketCombination {
	private static final char OPEN_PARANTHESIS = '(';
	private static final char CLOSE_PARANTHESIS = ')';
	private static char[] arr = new char[100];

	public static void printBracket(int n) {
		printParanthesis(0, n, 0, 0);

	}

	static void printParanthesis(int pos, int n, int open, int close) {
		
		System.out.println("*********************************"+"pos = "+pos+",n ="+n+",open ="+open+",close ="+close);
		if (close == n) {
			System.out.println(arr);
			return;
		} else {
			if (close < open) {
				arr[pos] = CLOSE_PARANTHESIS;
				printParanthesis(pos + 1, n, open, close + 1);
			}
			if (open < n) {
				arr[pos] = OPEN_PARANTHESIS;
				printParanthesis(pos + 1, n, open + 1, close);
			}
		}
	}

	public static void main(String[] args) {
		printBracket(2);
		
		
	}
}
