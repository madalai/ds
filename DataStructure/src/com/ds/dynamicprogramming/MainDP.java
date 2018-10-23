package com.ds.dynamicprogramming;

import java.io.InputStreamReader;
import java.util.Scanner;

public class MainDP {
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(new InputStreamReader(System.in));
		int t = sc.nextInt();
		for (int i = 1; i <= t; i++) {
			String s = sc.next();
			s = sc.next();
			String s1 = sc.next();
			String s2 = sc.next();
			System.out.println(dpSol(s1, s2));
		}
	}*/
	public static void main (String[] args) {
	
		    System.out.println(helper("axxxy").length());
		
	}
	public static String helper(String s){
	    StringBuffer sb = new StringBuffer();
	    for(int i = 0 ; i < s.length()-1 ; i++){
	        for(int j = i+1 ; j < s.length();j++){
	            if(s.charAt(i) == s.charAt(j)){
	                sb.append(s.charAt(i));
	            }
	        }
	    }
	    return sb.reverse().toString();
	}
	public static int dpSol(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();
		int arr[][] = new int[m + 1][n + 1];
		for (int j = 0; j <= n; j++) {
			arr[0][j] = 0;
		}
		for (int i = 0; i <= m; i++) {
			arr[i][0] = 0;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					arr[i][j] = 1 + arr[i - 1][j - 1];
				} else {
					arr[i][j] = Math.max(arr[i - 1][j], arr[i][j - 1]);
				}
			}
		}
		backTrack(arr, s1, s2, m, n);
		return arr[m][n];
	}

	private static void backTrack(int[][] dp, String s1, String s2, int m, int n) {
		int i = m;
		int j = n;
		StringBuffer ans = new StringBuffer();
		while (i > 0 && j > 0) {
			if (dp[i][j] > Math.max(dp[i - 1][j], dp[i][j - 1]) && dp[i][j] == 1 + dp[i - 1][j - 1]) {
				ans.append(s1.charAt(i - 1));
				i--;
				j--;
			} else {
				if (dp[i][j] == dp[i - 1][j]) {
					i--;
				} else {
					j--;
				}
			}
		}
		System.out.println(ans.reverse().toString());

	}

	public static int lcs(String s1, String s2) {
		if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) {
			return 0;
		}
		if (s1.charAt(0) == s2.charAt(0)) {
			return 1 + lcs(s1.substring(1), s2.substring(1));
		}

		return Math.max(lcs(s1, s2.substring(1)), lcs(s1.substring(1), s2));
	}
}
