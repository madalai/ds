package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort {

	public static List<Integer> sort(int arr[],int k){
		
		
		for(int i = 0 ; i < k ;i++){
			for(int j = 0 ; j < arr.length-i-1;j++){
				if(arr[j] > arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		List<Integer> list = new ArrayList<>();
		int n = arr.length-1;
		while(k>0){
			list.add(arr[n]);
			n--;
			k--;
		}
		
		return list;
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {1, 23, 12, 9, 30, 2, 50};
		for(int a : sort(arr,3)){
			System.out.println(a);
		}
	}
}
