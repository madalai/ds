package com.String;

public class PrintAllPermutation {
int count = 0;
	public static void main(String[] args) {
		PrintAllPermutation obj = new PrintAllPermutation();
		obj.printPermutation("abcd");
	}
	public void printPermutation(String str){
		
		//helper(str,"");
		char ch[] ={'a','b','c'};
		helper1("abcd","");
	}

	public void helper1(String str,String ans){
		if(str.length() == 0){
			System.out.println(++count +" "+ans);
			return;
		}
		for(int i = 0 ; i < str.length() ; i++){
			String tmpAns = ans;
			ans = ans + str.charAt(i);
			String tmpStr = str;
			str = str.replace(str.charAt(i)+"", "");
			
			helper1(str,ans);
			ans = tmpAns;
			str = tmpStr;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private void helper(String given, String choosen) {
		
		if(given.length() == 0){
			System.out.println(choosen);
			return;
		}
		String tempG = given;
		String tempC = choosen;
		for(int i = 0 ; i < given.length() ; i++){
			char ch = given.charAt(i);
			choosen = choosen+ch;
			given = given.replace(ch+"", "");
			
			helper(given,choosen);
			given = tempG;
			choosen = tempC;
		}
		
	}
}
