package com.ds.array;

public class SortedArrayInsertionAndDeletion {
	public static int deleteSortedArray(int arr[],int length,int key,int capacity){
		int pos = BinarySearch.search(arr, key, 0, length);
		if(pos == -1){
			return length;
		}
		for(int i = pos ;i<length;i++){
			arr[i] = arr[i+1];
		}
		ArrayUtil.printArray(arr);

		return length-1;
	}

	public static int insertSortedArray(int arr[],int length,int key,int capacity){
		if(length >= capacity){
			return length;
		}
		int i;
		for(i = length-1; (i>=0 && arr[i]>key); i--){
			arr[i+1] = arr[i];
		}
		arr[i+1] = key;
		ArrayUtil.printArray(arr);
		return length+1;
	}

	
	public static void main(String[] args) {
		int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int length = 6;
        int key = 20;
		
		//int arr[10] = {1,2,3,5,8,99,100,333};
		//System.out.println(insertSortedArray(arr, length, key, capacity));
        System.out.println(deleteSortedArray(arr, length, key, capacity));
	}
}
