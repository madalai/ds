package com.ds.array;

public class BinarySearch {

	public static int search(int arr[],int number , int start,int end){
		
		//while(start < end){
			if(arr[start] == number){
				return start;
			}
			else{
				int mid = (start+end)/2;
				if(arr[mid] == number){
					return mid;
				}
				else if(arr[mid] > number){
					return search(arr,number,start,mid-1);
				}
				else{
					return search(arr,number,mid+1,end);
				}
				
			}
		//}
		
		//return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,8,99,100,333};
		System.out.println(search(arr, 333, 0, arr.length-1));
	}
}
