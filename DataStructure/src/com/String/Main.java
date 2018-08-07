package com.String;

public class Main {
public static void main(String[] args) {
	int n =22;
	String bin = Integer.toBinaryString(n);
	char arr[] = bin.toCharArray();
	
	int maxDistance = 0,one  = 0;
	
	for(int i = 0 ; i < arr.length;i++){
		if(arr[i] != '1')continue;
		if(i-one > maxDistance){
			maxDistance = i-one;
		}
		one = i;
		
	}
	
	System.out.println(maxDistance);
}
}
