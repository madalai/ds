package com.ds.array;

public class FindMinimumInRotatedSortedArray {
public int findMin(int[] nums) {
        
        int l = nums.length;
        if(l == 1 || nums[0] < nums[l-1]){
            return nums[0];
        }
        
        int start = 0;
        int end = l-1;
        
        while(start <= end){
            
            int mid = (start+end)/2;
            
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }
            
            if(nums[mid] >= nums[start]){
                start = mid+1;
            }
            else{
                end = mid -1;
            }
        }
        
        return -1;
       
        
    }

	public static void main(String[] args) {
    	int arr[] = {4,5,1,2,3};
    	int min = new FindMinimumInRotatedSortedArray().findMin(arr);
    	System.out.println(min);
	}

}
