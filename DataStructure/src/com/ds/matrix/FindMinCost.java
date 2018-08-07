package com.ds.matrix;

public class FindMinCost {

	public static int findMinCost(int arr[][],int m,int n){
		int minCost = 0;
		if(m==0 && n == 0){
			return arr[m][n];
		}
		else{
			minCost = minCost + min(findMinCost(arr, m-1, n-1),findMinCost(arr, m, n-1),findMinCost(arr, m-1, n));
		}
		return minCost;
	}

	private static int min(int i, int j, int k) {
		if(i>j)
			return j < k ? j :k;
		else{
			return i < k ? i :k ;
		}
		
	}
	
	public static void main(String[] args) {
		int arr [][] = new int[3][3];
		for(int i = 1 ; i <= 3 ; i++){
			for(int j = 1 ; j  <= 3 ;j++){
				arr[i-1][j-1] = i ;
			}
		}
		System.out.println(findMinCost(arr, 2, 2));
	}
}
