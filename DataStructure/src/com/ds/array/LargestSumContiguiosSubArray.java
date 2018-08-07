package com.ds.array;

/**
 * program to find the sum of contiguous subarray within a one-dimensional array
 * of numbers which has the largest sum.
 * 
 * @author madalai
 *
 */
public class LargestSumContiguiosSubArray {

	// broute force solution
	public static int findLargestSum(int arr[], int size) {
		int largestSum = 0;
		for (int i = 0; i < size - 1; i++) {
			int sum = arr[i];
			for (int j = i + 1; j < size; j++) {
				sum = sum + arr[j];
				if (sum > largestSum) {
					largestSum = sum;
				}
			}
		}
		return largestSum;
	}

	public static int findLargestSumByOneIteration(int arr[], int size) {

		int maxSoFar = 0;
		int maxEndingHere = 0;
		for (int i = 0; i < size; i++) {
			maxEndingHere = maxEndingHere + arr[i];
			if (maxEndingHere < 0) {
				maxEndingHere = 0;
			}
			if (maxEndingHere > maxSoFar) {
				maxSoFar = maxEndingHere;
			}
		}
		return maxSoFar;
	}

	public static int findLargestSumByDynamicProgramming(int arr[], int size) {
		int maxSoFar = arr[0];
		int currentMax = arr[0];
		for (int i = 1; i < size; i++) {
			currentMax = Math.max(arr[i], currentMax + arr[i]);
			maxSoFar = Math.max(maxSoFar, currentMax);
		}
		return maxSoFar;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 4, -1, 5, -9, 100 };
		System.out.println(findLargestSum(arr, arr.length));
		System.out.println(findLargestSumByOneIteration(arr, arr.length));
		System.out.println(findLargestSumByDynamicProgramming(arr, arr.length));
	}

}
