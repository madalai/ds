package com.ds.array;

/**
 * Given an array A[] and a number x, check for pair in A[] with sum as x
 * @author madalai
 *
 */
public class FindPairInArrayWithSumX {
//Lets consider its an sorted array.If not we need to sort it first
	public static boolean isPairPresent(int arr[],int length,int key){
		//sort
		
		int l = 0;
		int r = length -1;
		while(l<r){
			if(arr[l]+arr[r] == key){
				System.out.println("Elements in the pair are:"+arr[l]+","+arr[r]);
				return true;
			}
			else if(arr[l]+arr[r] < key){
				l++;
			}
			else{
				r--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 4, 45, 47, 100, 108};
        
        
        System.out.println(isPairPresent(arr,6,208));
	}
}
