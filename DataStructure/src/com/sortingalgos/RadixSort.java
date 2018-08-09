package com.sortingalgos;

public class RadixSort {

	public int[] sort(int arr[]){
		int largest = Integer.MIN_VALUE;
		
		for(int i = 0 ; i <arr.length ; i++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}
		
		int temp[] = new int[largest+1];
		
		for(int i = 0 ; i <arr.length ;i ++){
			temp[arr[i]] = temp[arr[i]] +1;
		}
		int count = 0 ;
		for(int i = 0 ; i <temp.length ; i++){
			int ele = temp[i];
			if(ele == 0){continue;}
			if(ele == 1){
				arr[count] = i;
				count ++;
				continue;
			}
			while(ele != 0){
				arr[count] = i;
				count++;
				ele --;
			}
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		RadixSort obj = new RadixSort();
		int arr[] = {7,5,4,2,1};
		for(int a :obj.sort(arr)){
			System.out.println(a);
		}
	}
}
