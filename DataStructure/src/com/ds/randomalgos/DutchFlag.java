package com.ds.randomalgos;

public class DutchFlag {

	public static void main(String[] args) {
		int arr[] = {0,1,2,0,1,2,0,0};
		sort()
	}
	public static void sort(int arr[]){
		if(arr == null){return;}
		int low = 0;
		int mid  = 0;
		int high = arr.length-1;
		while(mid<=high){
			if(arr[mid] == 0){
				swap(arr,low,mid);
				low++;
				mid++;
			}else if(arr[mid] == 1){
				mid++;
			}else{
				swap(arr,mid,high);
				high--;
			}
		}
	
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}
}
