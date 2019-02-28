package com.ds.randomalgos;

public class Main {
	public static void main(String[] args) {
		printParenthesis(3,0,0,"");
		towersOfHinoi("A", "C", "B", 3);
		
	}

	private static void printParenthesis(int n, int open, int close, String ans) {
		if(close == n){
			System.out.println(ans);
			return;
		}
		if(open < n){
			printParenthesis(n, open+1, close, ans +"(");
		}
		if(close < open){
			printParenthesis(n, open, close+1, ans +")");
		}
		
	}
	private static void towersOfHinoi(String source,String dest,String tmp,int n){
		if(n==0){
			return;
		}
		towersOfHinoi(source,tmp , dest, n-1);
		System.out.println("Move "+n +" from "+source +" to "+dest);
		towersOfHinoi(tmp, dest, source, n-1);
	}
	
	
}

