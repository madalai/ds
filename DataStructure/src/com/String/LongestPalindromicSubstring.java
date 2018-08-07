package com.String;

import java.util.Stack;

public class LongestPalindromicSubstring {
	public String longestPalindrome(String s) {
		char arr[] = s.toCharArray();
		char rev[] = new char[s.length()];
		int dp[] = new int[s.length()];
		int j = 0 ;
		for(int i = arr.length-1;i>=0;i--){
			rev[j] = arr[i];
			j++;
		}
		
		for(int k = 0 ; k < s.length() ;k++){
			if(arr[k]==rev[k]){
				dp[k] =1;
			}
		}
		
		int start = 0;
		int end = 0;
		int i = 0;
		//Stack<Integer>  stack = new Stack<>();
		
		while(i < dp.length){
			if(dp[i] == 1){
				start = i;
			}
				
			}
		return null;
		}

	

	public String helper(String s){
		System.out.println("helper Ip>>"+s);
		StringBuilder s1 = new StringBuilder(s);
		StringBuilder s2 = new StringBuilder(s);
	        if(s1.toString().equals(s2.reverse().toString())){
	            return s;
	        }
	        
	        String a = helper(s.substring(0,s.length()-1));
	        String b =  helper(s.substring(1,s.length()));
	        
	        System.out.println("OUTPUT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> A"+a );
	        System.out.println("OUTPUT>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> B"+b );
	                            
	        return a.length()>b.length()?a:b;
	    }
	
	
	public static void main(String[] args) {
		LongestPalindromicSubstring obj = new LongestPalindromicSubstring();
		//
	    System.out.println(obj.longestPalindrome("babaddtattarrattatddetartrateedredividerb"));
	}
}

