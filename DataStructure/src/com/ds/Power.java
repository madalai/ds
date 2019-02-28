package com.ds;

public class Power {

	public static int pow(int a,int n){
		int ans = 1;
		int tmp = a;
		for(int i=0;i<=31;i++){
			if(isSetBit(n,i)){
				ans = ans*tmp;
			}
			tmp = tmp *tmp;
		}
		return ans;
	}

	private static boolean isSetBit(int n, int i) {
		return ((n>>i)&1) == 1 ?true:false;
		
	}
	public static void main(String[] args) {
		System.out.println(pow(2,5));
	}
}
