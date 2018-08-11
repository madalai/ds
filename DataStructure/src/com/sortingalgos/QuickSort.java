package com.sortingalgos;

public class QuickSort {

	public void sort(int arr[],int start,int end){
		if(start >= end){
			return ;
		}
		
		int index = partition(arr,start,end);
		sort(arr,start,index-1);
		sort(arr,index+1,end);
		
	}

	private int partition(int[] arr, int start, int end) {
		
		int pIndex = start;
		int pivot = arr[end];
		
		for(int i = start ; i < end ;i++){
			
			if(arr[i] < pivot){
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
			
		}
		int temp = arr[end];
		arr[end] = arr[pIndex];
		arr[pIndex] = temp;
		return pIndex;
	}
	
	public static void main(String[] args) {
		QuickSort obj = new QuickSort();
		int arr[] = {7,5,4,2,1};
		obj.sort(arr,0,4);
		for(int a :arr){
			System.out.println(a);
		}
	}
}
