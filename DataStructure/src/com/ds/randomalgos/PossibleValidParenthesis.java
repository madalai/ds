package com.ds.randomalgos;

public class PossibleValidParenthesis {
public void printParenthesis(char arr[],int pos,int n, int open,int close){
	
	if(close == n){
		printArr(arr);
		return;
	}
	if(close < open){
		arr[pos]=')';
		printParenthesis(arr, pos+1, n, open, close+1);
	}
	if(open < n){
		arr[pos]='(';
		printParenthesis(arr, pos+1, n, open+1, close);
	}
}

private void printArr(char[] arr) {
	for(char c : arr){
		System.out.print(c);
	}
	System.out.println();
	
}

public void printParenthesis(char arr[],int n){
	printParenthesis(arr, 0, n, 0, 0);
}

public static void main(String[] args) {
	PossibleValidParenthesis obj = new PossibleValidParenthesis();
	char arr[] = new char[6];
	obj.printParenthesis(arr, 3);
}
}
