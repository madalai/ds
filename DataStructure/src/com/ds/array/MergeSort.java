package com.ds.array;

public class MergeSort {

	public static void sort(int arr[], int start, int end) {

		if (start < end) {
			int mid = (start + end) / 2;
			sort(arr, start, mid);
			sort(arr, mid + 1, end);

			merge(arr, start, mid, end);
		}
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int n1 = 1 + mid - start;
		int n2 = end - mid;
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		
		for(int i = 0 ; i<n1;i++){
			arr1[i] = arr[start+i];
		}
		for(int i = 0 ; i<n2;i++){
			arr2[i] = arr[mid+1+i];
		}
		
		int j = 0 ;
		int  k = 0;
		
		while(j < n1 && k<n2){
			if(arr1[j] < arr2[k]){
				arr[start] = arr1[j];
				j++;
				start++;
			}
			else{
				arr[start] = arr2[k];
				k++;
				start++;
			}
		}
		while(j < n1){
			arr[start] = arr1[j];
			start++;
			j++;
		}
		
		while(k < n2){
			arr[start] = arr2[k];
			start++;
			k++;
		}
		

	}
	public static void main(String[] args) {
		int arr[] = {12, 11,6,7, 13, 5, 6, 7};
		sort(arr, 0, arr.length-1);
		for(int a:arr){
			System.out.print(a +",");
		}
	}
}
