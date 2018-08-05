package com.ds.dynamicprogramming;

/**
 * LCS Problem Statement: Given two sequences, find the length of longest
 * subsequence present in both of them. A subsequence is a sequence that appears
 * in the same relative order, but not necessarily contiguous. For example,
 * “abc”, “abg”, “bdf”, “aeg”, ‘”acefg”, .. etc are subsequences of “abcdefg”.
 * So a string of length n has 2^n different possible subsequences.
 * 
 * It is a classic computer science problem, the basis of diff (a file
 * comparison program that outputs the differences between two files), and has
 * applications in bioinformatics.
 * 
 * Examples: LCS for input Sequences “ABCDGH” and “AEDFHR” is “ADH” of length 3.
 * LCS for input Sequences “AGGTAB” and “GXTXAYB” is “GTAB” of length 4.
 * 
 * @author madalai
 *
 */
public class LongestCommonSequence {

	private static final String EMPTY_STRING = "";

	public static String findLCS(char[] c1, char[] c2) {
		String lcs = "";

		String[][] matrix = new String[c1.length][c2.length];

		for (int i = 0; i < c1.length; i++) {
			for (int j = 0; j < c2.length; j++) {

				if ((i == 0) || (j == 0)) {
					if (c1[i] == c2[j]) {
						matrix[i][j] = "" + c1[i];
					} else {
						if (i > j) {
							matrix[i][j] = longest(EMPTY_STRING, matrix[i - 1][j]);
						} else if (i < j) {
							matrix[i][j] = longest(EMPTY_STRING, matrix[i][j - 1]);
						} else {
							matrix[i][j] = EMPTY_STRING;
						}

					}
				} else {
					if (c1[i] == c2[j]) {
						matrix[i][j] = longest(matrix[i - 1][j], matrix[i][j - 1]) + c1[i];
					} else {
						matrix[i][j] = longest(matrix[i - 1][j], matrix[i][j - 1]);
					}
				}
			}
		}
		lcs = matrix[c1.length - 1][c2.length - 1];

		return lcs;
	}

	private static String longest(String s1, String s2) {

		return s1.length() > s2.length() ? s1 : s2;
	}

	public static void main(String[] args) {
		String s1 = "AGGTAB";
		String s2 = "GXTXAYB";
		String lcs = findLCS(s1.toCharArray(), s2.toCharArray());
		System.out.println(lcs);
	}
}
