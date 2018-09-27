package com.ds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
	static Set<Integer> set = new HashSet<>();
	static int range = 100000000;
	

	public static void main(String[] args) throws Exception {
		System.out.println(convertToTitle(53));

	}

	public static String convertToTitle(int n) {
		int fac = 26;
		String s = "";
		while (n > 0) {
			n--;
			s = (char) (n % 26 + 'A') + s;
			n = n / fac;
		}
		return s;
	}

	static boolean isPower(int n) {

		if (set.contains(n))
			return true;
		for (int i = 2; i <= n / i; i++) {
			int pow = i;
			while (pow <= n) {
				pow = pow * i;
				set.add(pow);
				if (pow == n) {
					return true;
				}
			}

		}
		return false;
	}

}