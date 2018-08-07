package com.ds.dynamicprogramming;

/**
 * find the number of ways to come to the buttom right from top left 
 * @author madalai
 *
 */
public class NumberOfWaysToComeToMatrix {

	public static  int findNoOfWays(int arr[][],int width,int height){
		int tempArr[][] = new int[width][height];
		for(int i = 0; i<width ; i++){
			for(int j = 0; j<height ; j++){
				if(i == 0 || j ==0){
					tempArr[i][j] = 1;
				}
				else{
					tempArr[i][j] = tempArr[i-1][j] + tempArr[i][j-1];
				}
			}
		}
		
		
		return tempArr[width-1][height-1];
	}
	
	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int n = findNoOfWays(arr,4,4);
		System.out.println(n);
		
	}
}
