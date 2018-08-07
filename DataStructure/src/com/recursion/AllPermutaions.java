package com.recursion;

/**
 * Given the value of N we have to output all the permutations of numbers from 1 to N.

Examples:

Input : 2
Output : 1 2
         2 1

Input : 3
Output : 1 2 3
         1 3 2
         2 1 3
         3 1 2
         2 3 1
         3 2 1
 * @author madalai
 *
 */
public class AllPermutaions {
	
	private static int[] arr = new int[100];
	static int i =0;
	
	public static void printPermutation(int n){
		printPermutation(n,0,0);
		
		
	}
	
	public static void printPermutation(int n,int elements,int pos){
		
		if(elements == n){
			for(int j =0;j< n ;j++){
			System.out.print(arr[j]);
			}
			System.out.println();
			return;
		}
		else{
			i++;
			arr[pos] = i;
			printPermutation(n,elements+1,pos+1);
		}
		
	}
	
	public static void main(String[] args) {
		printPermutation(2);
	}

}
