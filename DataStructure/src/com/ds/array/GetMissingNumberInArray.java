package com.ds.array;

/**
 * You are given a list of n-1 integers and these integers are in the range of 1
 * to n. There are no duplicates in list. One of the integers is missing in the
 * list. Write an efficient code to find the missing integer.
 * 
 * @author madalai
 *
 */
public class GetMissingNumberInArray {

	public static int getMissingNumberInArray(int arr[], int size) {
		int xorOnArr = 0;
		for (int i = 0; i < size; i++) {
			xorOnArr = xorOnArr ^ arr[i];
		}
		int xorTillLastElement = 0;
		for (int i = 1; i <= size+1; i++) {
			xorTillLastElement = xorTillLastElement ^ i;
		}
		return xorOnArr ^ xorTillLastElement;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 8, 7, 10 };
		System.out.println(getMissingNumberInArray(arr, 9));
	}
}
