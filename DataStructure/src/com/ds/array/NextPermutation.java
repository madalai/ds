package com.ds.array;

import java.util.Arrays;

public class NextPermutation {
	public void nextPermutation(int[] nums) {
        if(nums == null){return;}
        if(nums.length <  2){return;}
       int n =nums.length;
     int i =  n-1;
     
     while(i>0  && nums[i-1] >= nums[i]){
         i--;
     }
     
     if(i-1 < 0){
         Arrays.sort(nums);
         return;
     }
     int j = n-1;
     
     while(nums[i-1] >= nums[j]){
         j--;
     }
     swap(nums,i-1,j);
        
    }
    
    public void swap(int[] nums,int i ,int j){
        
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        
        Arrays.sort(nums, i+1, nums.length);
    }
	    
	    public static void main(String[] args) {
			int nums[] = {4,2,0,2,3,2,0};
			NextPermutation obj = new NextPermutation();
			
			obj.nextPermutation(nums);
			
			for(int a: nums){
				System.out.print(a);
				System.out.print(",");
			}
			
		}
}
