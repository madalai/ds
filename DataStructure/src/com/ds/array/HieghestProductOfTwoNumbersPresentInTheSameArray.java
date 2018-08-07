package com.ds.array;

/**
 * An array is given.Find the highest product of two numbers so that the product
 * number is also present in the same array
 * 
 * @author madalai
 *
 */
public class HieghestProductOfTwoNumbersPresentInTheSameArray {
	public static void main(String[] args) {

		int arr[] = {2,3,6,7,89,11,321,8,4,9790,10,979};
		findProduct(arr);
	}

	private static void findProduct(int[] arr) {
		if(arr.length < 2){
			System.out.println("Insufficent size of array");
			return;
		}
		int heighestProduct = 0;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				int product = arr[i]*arr[j];
				if(product > heighestProduct && isPresentInArray(product,arr)){
					heighestProduct = product;
				}
			}
		}
		
		System.out.println("Heighest Product ="+ heighestProduct);;
		
	
		
	}

	private static boolean isPresentInArray(int product,int[] arr) {
		for(int i = 0;i<arr.length;i++){
			if(arr[i] == product)
				return true;
		}
		return false;
	}
}
 