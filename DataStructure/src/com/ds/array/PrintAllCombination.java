package com.ds.array;

import java.util.Arrays;

public class PrintAllCombination {

	public static void main(String[] args) {
		int arr[] = {10,10};
		System.out.println(findPair(arr, 20));
	}
    static boolean findPair(int arr[],int k){
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length-1 ; i++){
            
            if(Arrays.binarySearch(arr,i+1,arr.length,(k-arr[i])) >= 0){
                return true;
            }
        }
        return false;
    }
}
