package com.sortingalgos;

public class SelectionSort {

	public int[] sort(int arr[]){
		
		for(int i = 0 ; i <arr.length-1; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		SelectionSort obj = new SelectionSort();
		int arr[] = {7,5,4,2,1};
		for(int a :obj.sort(arr)){
			System.out.println(a);
		}
	}
}
