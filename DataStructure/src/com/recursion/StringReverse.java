package com.recursion;

/**
 * reverse string using recursion
 * @author madalai
 *
 */
public class StringReverse {

	public static String reverse(String str){
		
		if(str == null){
			return "";
		}
		//Base condition
		if(str.length() == 1){
			return str;
		}
		
		return str.charAt(str.length()-1) + reverse(str.substring(0, str.length()-1));
	}
	
	public static void main(String[] args) {
		System.out.println(reverse("abcdef"));
	}
}
