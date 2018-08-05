package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class PermuteUnique {
    public List<List<Integer>> permuteUnique(int[] nums) {
        
        List<List<Integer>> mainList = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        
        for(int a : nums){
            list.add(a);
            
        }
        
        backtrack(list,mainList,new ArrayList<Integer>());
        System.out.println(mainList.size());
        
        return mainList;
        
        
    }
    
    public void backtrack(List<Integer> list,List<List<Integer>> mainList,List<Integer> choose){
        
        if(list.size() == 0 && !mainList.contains(choose)){
            mainList.add(new ArrayList<>(choose));
            return;
        }
        for(int i = 0 ; i < list.size() ;i++){
            Integer a  = list.get(i);
            choose.add(a);
            list.remove(a);
            backtrack(list,mainList,choose);
            choose.remove(choose.size()-1);
            list.add(i,a);
            
            
        }
    }
    
    public static void main(String[] args) {
		int nums[] = {3,1,-1,0,1};
		System.out.println(new PermuteUnique().permuteUnique(nums));
	}
}
