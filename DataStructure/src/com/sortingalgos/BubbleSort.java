package com.sortingalgos;

public class BubbleSort {

	public int[] sort(int arr[]){
		int n = arr.length;
		for(int i = 0 ; i < n-1 ; i++){
			
			for(int j = 0 ; j < n-i-1 ; j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		BubbleSort obj = new BubbleSort();
		int arr[] = {7,5,4,2,1};
		for(int a :obj.sort(arr)){
			System.out.println(a);
		}
	}
}
