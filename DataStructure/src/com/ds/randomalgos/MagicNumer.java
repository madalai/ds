package com.ds.randomalgos;

/**
 * If a number is power of 5 or sum of unique powers of 5
 * @author madalai
 *
 */
public class MagicNumer {

	public static int magicNumberNth(int n){
		int powerOf2 = findPowerOf2(n);
		int powerOf5 = powerOf2 +1;
		int magicNumber = 0;
		int no = (int) (n- powerOf5);
		for(int i = no;i>=0;i--){
			magicNumber = (int) (magicNumber+Math.pow(5, powerOf5-i));
		
		}
		return magicNumber;
	}

	private static int findPowerOf2(int n) {
		int power = 0;
		while(n != 1){
			n = n/2;
			power++;
		}
		return power;
	}
	
	public static void main(String[] args) {
		System.out.println(magicNumberNth(4));
	}
}
