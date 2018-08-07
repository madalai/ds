package com.String;

public class PrintAllPermutation {

	public static void main(String[] args) {
		PrintAllPermutation obj = new PrintAllPermutation();
		obj.printPermutation("abcd");
	}
	public void printPermutation(String str){
		
		helper(str,"");
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
