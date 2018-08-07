package com.recursion;

public class PrintPermutationOfArray {
	
	public static void printPermutation(int arr[],int currentFocus){
		
		logMethodCall(arr, currentFocus);
		
		if(currentFocus == arr.length-1){
			printArray(arr);
			return;
		}
		
		printPermutation(arr, currentFocus+1);
		
		for(int i = currentFocus+1;i<arr.length;i++){
			
			int temp = arr[currentFocus];
			arr[currentFocus] = arr[i];
			arr[i] = temp;
			
			printPermutation(arr, currentFocus+1);
			
		}
	}




	private static void logMethodCall(int[] arr, int currentFocus) {
		System.out.println("****METHOD CALLED WITH BELOW INFO***********");
		System.out.println("Array is : ");
		printArray(arr);
		System.out.println("************ARRAY END***************");
		System.out.println("Current Focus :"+currentFocus);
	}




	private static void printArray(int[] arr) {
		for(int i = 0 ; i< arr.length ;i++){
			System.out.print(arr[i]);
			System.out.print(",");
		}
		System.out.println();
	}
	
	

	
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		printPermutation(arr, 0);
	}

}
