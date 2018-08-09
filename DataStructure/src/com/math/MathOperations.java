package com.math;

public class MathOperations {

	public static  int gcd(int a, int b) {
		if (a == 0) {
			return b;
		}
		return gcd(b % a, a);

	}
	
	public static int lcm(int a , int b){
		int gcd = gcd(a,b);
		return (a*b)/gcd;
	}
	
	public static void main(String[] args) {
		System.out.println(MathOperations.lcm(12,15));
		System.out.println(MathOperations.gcd(9, 15));
	}
}
