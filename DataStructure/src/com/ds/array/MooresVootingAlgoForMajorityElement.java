package com.ds.array;

/**
 * Majority Element: A majority element in an array A[] of size n is an element
 * that appears more than n/2 times (and hence there is at most one such
 * element).
 * 
 * @author madalai
 *
 */
public class MooresVootingAlgoForMajorityElement {

	public static int findCandidate(int arr[], int size) {

		int majority = arr[0];
		int count = 1;
		for (int i = 1; i < size; i++) {
			if (arr[i] == majority) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				majority = arr[i];
				count = 1;
			}

		}
		return majority;
	}
	
	public static boolean isMajority(int arr[],int candidate,int size){
		int count = 0;
		for(int i = 0 ; i<size;i++){
			if(arr[i] == candidate){
				count ++;
			}
		}
		if(count > size/2){
			return true;
		}
		return false;
	}
	
	public static String findMajority(int arr[], int size){
		int candidate = findCandidate(arr, size);
		return isMajority(arr, candidate, size)?""+candidate : "NONE";
	}
	public static void main(String[] args) {
		int arr[]={1,2,2,2,4,6,7,8,2,2,2,2,2,2,4,43,32,1,5};
		System.out.println(findMajority(arr, arr.length));
		
	}
}
