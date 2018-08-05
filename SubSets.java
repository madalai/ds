package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> given = new ArrayList<>();;
        
        for(int a: nums){
            given.add(a);
         }
         backtrack(mainList,given,new ArrayList<Integer>(),0);
         return mainList;   
             
    }
    
    public void backtrack(List<List<Integer>> mainList,List<Integer> given,List<Integer> choose,int start){
        if(start == given.size()){
            mainList.add(new ArrayList<>(choose));
            
        }
        else{
        	backtrack(mainList,given,choose,start+1);
        	Integer a = given.get(start);
        	choose.add(a);
        	backtrack(mainList,given,choose,start+1);
        	choose.remove(choose.size()-1);
        	
        }
        
       
        
    }
    
    public static void main(String[] args) {
		SubSets obj = new SubSets();
		int nums[] = {1,2,3};
		System.out.println(obj.subsets(nums));
	}

}
