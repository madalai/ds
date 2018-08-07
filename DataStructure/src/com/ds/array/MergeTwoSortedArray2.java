package com.ds.array;

public class MergeTwoSortedArray2 {
	public static void main(String[] args) {

		int arr1[] = new int[7];
		init(arr1);
		int arr2[] = { 2, 3, 8 };
		merge(arr1, arr2);
		for (int a1 : arr1) {
			System.out.print(a1 + ",");
		}

	}

	public static void merge(int arr1[], int arr2[]) {
		int n = arr1.length - 1;
		
		int i = arr1.length - arr2.length - 1;
		int j = arr2.length - 1;

		

		while (i >= 0 || j >= 0) {

			
			if (i < 0 && j >= 0) {
				while (n >= 0) {
					arr1[n] = arr2[j];
					j--;
					n--;
				}
				break;

			}

			if (arr1[i] > arr2[j]) {
				arr1[n] = arr1[i];
				arr1[i] = Integer.MIN_VALUE;
				i--;
				n--;
				continue;
			}
			if (arr2[j] > arr1[i]) {
				arr1[n] = arr2[j];
				j--;
				n--;
			}
		}

	}

	private static void init(int[] arr1) {
		arr1[0] = 4;
		arr1[1] = 6;
		arr1[2] = 7;
		arr1[3] = 19;

	}
}
