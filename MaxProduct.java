package com.ds.array;

public class MaxProduct {
	  int max= Integer.MIN_VALUE;
	    public int maxProduct(int[] nums) {
	    	
	        
	        for(int i = 0 ; i < nums.length ;i++){
	        findMax(nums,i,nums.length);
	        }
	        return max;
	    }
	    
	    public void findMax(int[] nums,int start,int end){
	        int m = 1;
	        for(int i = start ; i<end ;i++){
	            m = m*nums[i];
	            
	            if(m > max){
	                max = m;
	            }
	        }
	    }
	    
	    public static void main(String[] args) {
	    	int arr[] = {-2};
			MaxProduct obj = new MaxProduct();
			System.out.println(obj.maxProduct(arr));
		}
}
