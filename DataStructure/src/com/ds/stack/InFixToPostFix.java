package com.ds.stack;

import java.util.Stack;

public class InFixToPostFix {
	public static void main(String[] args) {
		System.out.println(IntoPostFix("a*b+c/(d+e)"));
	}

	public static String IntoPostFix(String exp){
		Stack<Character> stack = new Stack<>();
		String res ="";
		for(int i=0;i<exp.length();i++){
			Character ch = exp.charAt(i);
			if(ch.equals('(')){
				stack.push(ch);
				
			}
			else if(Character.isLetter(ch) || Character.isDigit(ch)){
				res = res + ch;
			}
			else if(isOperator(ch)){
				while(!stack.isEmpty() && (getPriority(ch)< getPriority(stack.peek()))){
					res=res+stack.pop();
				}
				stack.push(ch);
			}
			else if(ch.equals(')')){
				while(!stack.isEmpty() && !stack.peek().equals('(')){
					res += stack.pop();
				}
				stack.pop();
			}
		}
		while(!stack.isEmpty()){
			res += stack.pop();
		}
		return res;
	}
	
	public static boolean isOperator(Character c){
		return c.equals('+') || c.equals('-') || c.equals('*') || c.equals('/');
	}
	
	public static int getPriority(Character ch){
		if(ch.equals('+') || ch.equals('-') ){
			return 1;
		}
		if(ch.equals('*') || ch.equals('/') ){
			return 2;
		}
		return 0;
	}
}
