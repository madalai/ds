package com.ds.array;

public class LongestPalindromSubstring {
	int low,maxlength;
	public String longestPalindrome(String s) {
			if(s.length() < 2){
				return s;
			}
		for(int i = 0 ; i < s.length()-1 ; i ++){
			helper(s,i,i);
			helper(s,i,i+1);
		}
		
		return s.substring(low, low+maxlength);
	}

	public void helper(String s,int i,int j){
		
		while(i >= 0 && j < s.length() && s.charAt(i)==s.charAt(j) ){
			i--;
			j++;
			
		}
		if(maxlength < j-i -1){
			low = i +1;
			maxlength = j-i-1;
		}
	}
	
	public static void main(String[] args) {
		LongestPalindromSubstring obj =  new LongestPalindromSubstring();
		System.out.println(obj.longestPalindrome("abcdmadamabcd"));
		
	}
}
