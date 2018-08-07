package com.ds.array;

public class PeakElement {
	int findPeakElement(int nums[])
	{
		int n = nums.length;
		if(n == 1) return nums[0];
		if(n == 2) return nums[0]>nums[1]?nums[0]:nums[1];
		
		int start = 0;
		int end = n-1;
		
		while(start <= end){
			int mid = (start+end)/2;
			
			boolean leftSmall = (mid -1) >= 0 ? nums[mid]>nums[mid-1]:true;
			boolean rightSmall = (mid+1)<n ? nums[mid]>nums[mid+1]:true;
			
			if(leftSmall && rightSmall){
				return mid;
			}
			else if(leftSmall){
				start = mid+1;
			}
			else{
				end = mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		PeakElement obj = new PeakElement();
		int arr[] = {1,2,3};
		System.out.println(obj.findPeakElement(arr));
	}
}
