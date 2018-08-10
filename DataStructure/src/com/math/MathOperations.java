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
	
	public static int gcd(int arr[]){
		if(arr.length == 1){
			return arr[0];
		}
		int tmp = gcd(arr[0],arr[1]);
		for(int i = 2; i < arr.length ;i++){
			tmp = gcd(tmp,arr[i]);
		}
		
		return tmp;
	}
	
	public static int lcm(int arr[]){
		
 	   if(arr.length == 0){
           return 0;
       }
       if(arr.length == 1)return arr[0];
       
       int temp = lcm(arr[0],arr[1]);
       
       for(int i = 2 ;i <arr.length ;i++){
           temp = lcm(arr[i],temp);
       }
       return temp;
	}
	public static void main(String[] args) {
		System.out.println(MathOperations.lcm(12,15));
		System.out.println(MathOperations.gcd(9, 15));
	}
}
