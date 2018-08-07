package com.ds.array;

/**
 * An element in a sorted array can be found in O(log n) time via binary search.
 * But suppose we rotate an ascending order sorted array at some pivot unknown
 * to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise
 * a way to find an element in the rotated array in O(log n) time.
 * 
 * @author madalai
 *
 */
public class SearchElementInSortedRotatedArray {
	
	public static int findNoOfTimesArrayRotated(int arr[], int m, int n){
		int pivot = findPivot(arr, m, n);
		return -1;
	}

	private static int findPivot(int[] arr, int m, int n) {
		if(m > n){
			return -1;
		}
		if(m == n){
			return m;
		}
		
		int mid = (m+n)/2;
		
		
		return 0;
		//return mid;
	}

	public static int find(int arr[], int m, int n, int key) {
		int mid = (m + n) / 2;
		while (m <= n) {
			if (arr[mid] == key) {
				return mid;
			} else {
				if ((arr[mid] > key) && (arr[m] < key)) {

					return find(arr, m, mid - 1, key);
				}

				else {
					return find(arr, mid + 1, n, key);
				}
			}
		}

		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {3,4,5,7,1,2};
		System.out.println(find(arr, 0, arr.length-1, 4));
	}
}
