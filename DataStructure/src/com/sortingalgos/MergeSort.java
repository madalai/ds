package com.sortingalgos;

public class MergeSort {
	
	public static void main(String[] args) {
		int arr[] = {3,2,1};
		MergeSort obj = new MergeSort();
		obj.sort(arr, 0, arr.length-1);
		for(int a:arr){
			System.out.println(a);
		}
	}
	public void sort(int arr[],int start,int end){
		
		if(start == end){
			return;
		}
	   int mid = (start + end )/2;
	   sort(arr,start,mid);
	   sort(arr,mid+1,end);
	   merge(arr,start,mid,mid+1,end);
	   
	   
	}

	private void merge(int[] arr, int start1, int end1, int start2, int end2) {
		
	  int length1 = 1+end1-start1 ;
	  int length2 = 1+end2-start2;
	  
	  int left[] = new int[length1];
	  int right[] = new int[length2];
	  
	  for(int i = 0 ; i < length1 ; i++){
		  left[i] = arr[start1+i];
	  }
	  for(int i = 0 ; i < length2 ; i++){
		  right[i] = arr[start2+i];
	  }
		int i = 0;
		int j = 0;
		int k = start1;
		
		
		while(k<length1+length2){
			if(i < length1 && j< length2){
			if(left[i] < right[j]){
				arr[k] = left[i];
				i++;
				k++;
			}
			else{
				arr[k] = right[j];
				j++;
				k++;
			}
			}else{
				if(i >= length1){
					while(j < length2){
						arr[k] = right[j];
						k++;
						j++;
					}
				}
				else{
					while(i < length1){
						arr[k] = left[i];
						i++;
						j++;
					}
				}
				break;
			}
		}
		
		
	}
}
