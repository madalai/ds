package com.recursion;

public class ParenthesisScore {

	public static void main(String[] args) {
		ParenthesisScore obj = new ParenthesisScore();
		System.out.println(obj.scoreOfParentheses("(()(()))"));
	}
public int scoreOfParentheses(String s) {
        
        int i = 0;
    
        
        while(i < s.length()-1){
            
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')'){
            	
                return 1+ scoreOfParentheses(s.substring(i+1,s.length()));
            }
            if(s.charAt(i) == '(' && s.charAt(i+1) == '('){
                return 2 * scoreOfParentheses(s.substring(i+1,s.length()));
            }
            else{
                i++;
            }
        }
        
        return 0;
    }
}
