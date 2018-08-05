package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
	
	 public List<List<Integer>> combine(int n, int k) {
	        List<List<Integer>> mainList = new ArrayList<>();
	        List<Integer> given = new ArrayList<>();
	        for(int i = 1 ;i<=n;i++){
	        	given.add(i);
	        }
	        backtrack(k,mainList,given,new ArrayList<Integer>());
	        return mainList;
	    }
	    
	    public void backtrack(int k,List<List<Integer>> mainList,List<Integer> given,List<Integer> choose){
	        if(choose.size() == k){
	            mainList.add(new ArrayList<>(choose));
	            return;
	        }
	        for(int i = 0 ; i < given.size() ; i++){
	            Integer a = given.get(i);
	            if(choose.size() > 0){
	            	if(choose.get(choose.size()-1) > a){
	            		continue;
	            	}
	            }
	            choose.add(a);
	            given.remove(i);
	            backtrack(k,mainList,given,choose);
	            choose.remove(a);
	            given.add(i, a);
	        }
	    }
	    
	    public static void main(String[] args) {
			Combinations obj = new Combinations();
			System.out.println(obj.combine(4, 2));
		}

}
