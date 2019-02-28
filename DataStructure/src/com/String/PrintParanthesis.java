package com.String;

import java.util.ArrayList;
import java.util.List;

public class PrintParanthesis {
public static void main(String[] args) {
	PrintParanthesis obj = new PrintParanthesis();
	
	System.out.println(obj.generateParenthesis(6).toString());
}
	
	 public List<String> generateParenthesis(int n) {
	        List<String> list = new ArrayList<>();
	    //char arr[] = new char[n];
	        helper1("",0,0,n,list);
	        return list;
	        
	        
	    }
	    
	    private void helper1(String str, int open, int close, int n, List<String> list) {
		if(close+open == n && open == close){
			list.add(str);
			return;
		}
	    	if(open < n/2){
	    		//str = str+"(";
	    		helper1(str+"(", open+1, close, n, list);
	    	}
	    	if(close < open){
	    		//str = str +")";
	    		helper1(str+")", open, close+1, n, list);
	    	}
		
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
