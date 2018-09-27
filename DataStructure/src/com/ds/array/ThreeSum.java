package com.ds.array;

import java.util.Arrays;

public class ThreeSum {
	public static void main(String[] args) {
		int arr[] = {12,45,52,65,21,645,234,-100,14,575,-80,112};
		System.out.println(isTripletExixst(arr, 54));
	}
    static boolean isTripletExixst(int arr[],int k){
        Arrays.sort(arr);
        for(int i = 0 ; i <arr.length-2 ;i++){
            int req = k - arr[i];
            if(isPairExist(arr,req,i,arr.length)){
                return true;
            }
        }
        return false;
    }
    static boolean isPairExist(int arr[],int k,int start,int end){
        for(int i = start ; i < end ;i++){
            int req = k-arr[i];
            if(Arrays.binarySearch(arr,i+1,end,req) > 0){
                return true;
            }
        }
        return false;
    }

}
