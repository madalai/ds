package com.sortingalgos;

public class QuickSort {

	public void sort(int arr[],int low,int high){
		if(low < high){
			int j = partition(arr, low, high);
			if(j == -1){
				return;
			}
			sort(arr,low,j-1);
			sort(arr,j+1,high);
		}
	}

	private int partition(int[] arr, int low, int high) {
		if((high-low) < 2){
			return -1;
		}
		int i=low+1;
		int j = high;
		int pivot = low;
		while(i< j){
			while(i<=high && i >= low  && arr[i] < arr[pivot]){
				i++;
			}
			while( j>=low && j<= high && arr[j] > arr[pivot] ){
				j--;
			}
			if(i<j && j>=low && j<= high && i<=high && i >= low){
				swap(arr,i,j);
			}
			
		}
		
		//if(j>=low && j<= high && i<=high && i >= low)
		swap(arr,pivot,j);
		return j;
	}
	
	private void swap(int[] arr, int pos1, int pos2) {
		int tmp = arr[pos1];
		arr[pos1] = arr[pos2];
		arr[pos2] = tmp;
		
	}

	public static void main(String[] args) {
		QuickSort obj = new QuickSort();
		int arr[] = { 2, 66, 1, 23, 61, 44, 99, 11 };
		obj.sort(arr,0,arr.length-1);
		for(int a :arr){
			System.out.println(a);
		}
	}
}
