package com.sortingalgos;

public class InsertionSort {

	public int[] sort(int arr[]){
		
		for(int i = 0 ; i < arr.length ;i++){
			for(int j=0; j < i ; j++){
				
				if(arr[i] < arr[j]){
					
					int temp = arr[i];
					
					for(int k = i ; k > j ;k--){
						arr[k] = arr[k-1];
					}
					arr[j] = temp;
				}
			}
		}
		
		return arr;
	}
	public static void main(String[] args) {
		
	
     InsertionSort obj = new InsertionSort();
	int arr[] = {7,5,4,2,1};
	for(int a :obj.sort(arr)){
		System.out.println(a);
	}
}
}
