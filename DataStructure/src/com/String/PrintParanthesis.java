package com.String;

import java.util.ArrayList;
import java.util.List;

public class PrintParanthesis {
public static void main(String[] args) {
	PrintParanthesis obj = new PrintParanthesis();
	
	System.out.println(obj.generateParenthesis(3).toString());
}
	
	 public List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<>();
	    //char arr[] = new char[n];
	        helper("",0,0,n,list);
	        return list;
	        
	        
	    }
	    
	    public void helper(String str,int open,int close,int n,List<String> list){
	        if(close == n && open == close){
	            list.add(str);

	        }
	        else{
	        	if(close<open){
	        		helper(str+")",open,close+1,n,list);
	        	}
	        	if(open < n){
	        		helper(str+"(",open+1,close,n,list);
	        	}
	        }
	        
	    }
}
