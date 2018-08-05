package com.ds.array;

/**
 * We are given two sorted array. We need to merge these two arrays such that
 * the initial numbers (after complete sorting) are in the first array and the
 * remaining numbers are in the second array. Extra space allowed in O(1).
 * 
 * Example:
 * 
 * Input: ar1[] = {10}; ar2[] = {2, 3}; Output: ar1[] = {2} ar2[] = {3, 10}
 * 
 * Input: ar1[] = {1, 5, 9, 10, 15, 20}; ar2[] = {2, 3, 8, 13}; Output: ar1[] =
 * {1, 2, 3, 5, 8, 9} ar2[] = {10, 13, 15, 20}
 * 
 * @author madalai
 *
 */
public class MergeTwoSortedArray1 {

	public static void main(String[] args) {
		int arr1[] = { 1, 5, 9, 10, 15, 20 };
		int arr2[] = { 2, 3, 8, 13 };
		merge(arr1, arr2);
		for (int a1 : arr1) {
			System.out.print(a1 + ",");
		}
		System.out.println("");
		for (int a1 : arr2) {
			System.out.print(a1 + ",");
		}

	}

	public static void merge(int arr1[], int arr2[]) {

		int l1 = arr1.length;
		int l2 = arr2.length;

		for (int i = l2 - 1; i >= 0; i--) {
			if (arr2[i] < arr1[l1 - 1]) {
				int temp = arr2[i];
				arr2[i] = arr1[l1 - 1];
				int k = l1 - 1;
				while (temp < arr1[k]) {
					k--;
				}
				k++;
				for (int m = l1 - 1; m > k; m--) {
					arr1[m] = arr1[m - 1];
				}

				arr1[k] = temp;
			}
		}
	}
}
