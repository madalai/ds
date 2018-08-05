package com.ds.array;

/**
 * Write a function rotate(ar[], d, n) that rotates arr[] of size n by d
 * elements.
 * 
 * @author madalai
 *
 */
public class RotateArray {
	
	public static void rotate(int arr[],int size,int numberOfRotations){
		for(int i = numberOfRotations ; i > 0 ; i--){
			int j = arr[0];
			for(int k = 1;k<size ; k++){
				arr[k-1] = arr[k];
			}
			arr[size-1] = j;
		}
		
		
	}
	
	public static void main(String args[]) {
		int arr[] = new int[5];
		for(int i =0;i<5;i++){
			arr[i] = i+1;
		}
		
		rotate(arr, 5, 4);
		ArrayUtil.printArray(arr);

	}

}
