package com.ds.array;

public class MaxSumContiguiousSubArray {
	public static void main(String[] args) {
		int arr[] = {5,-1,-2,6,-4};
		MaxSumContiguiousSubArray obj = new MaxSumContiguiousSubArray();
		System.out.println(obj.maxSum(arr));
	}

	public int maxSum(int arr[]){
		int max = arr[0];
		int maxSoFar = arr[0];
		
		for(int i =1 ;i <arr.length ;i++){
			 maxSoFar = Math.max(arr[i], maxSoFar+arr[i]);
			 max = Math.max(max, maxSoFar);
		}
		
		return max;
	}

	
}
