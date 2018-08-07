package com.ds.array;

public class RotateByReversalAlgo {
	
	public static void rotate(int arr[],int lenght,int noOfTimes){
		reverse(arr,0,noOfTimes-1);
		reverse(arr,noOfTimes,lenght-1);
		reverse(arr, 0, lenght-1);
	}

	private static void reverse(int arr[], int start, int end) {
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end --;
		}
		
	}
	public static void main(String args[]) {
		int arr[] = new int[5];
		for(int i =0;i<5;i++){
			arr[i] = i+1;
		}
		
		rotate(arr, 5, 2);
		ArrayUtil.printArray(arr);

	}

}
