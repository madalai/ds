package com.ds.array;

public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {
		int arr[] = new int[2];
        for(int i = 0;i<numbers.length;i++){
            int req = target - numbers[i] ;
            
            int search = exists(numbers,i+1,req);
            if( search!= -1){
                arr[0] = i;
                arr[1] = search;
                return arr;
            }
        }
        return arr;
        
    }
    
    public int exists(int[] arr, int start,int target){
        int end = arr.length - 1;
        int mid = (start+end)/2;
        
        while(start <= end){
        	mid = (start+end)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    
    
    public static void main(String[] args) {
		int arr[] = {-3,-2,-1,0,5,6,9};
		TwoSum obj = new TwoSum();
		int res[]=obj.twoSum(arr, 15);
		System.out.println(res[0] +"   "+res[1]);
	}
}
