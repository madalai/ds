package com.ds.matrix;

public class DiagonalTraverse {
	
	public void traverse(int arr[][],int m,int n){
		int i = 0 ;
		int j = 0;
		while(i < m){
			int p = i;
			int q = j;
			while(p >= 0  && q <n){
			System.out.print(arr[p][q]+",");
			p--;
			q++;
			}
			System.out.println();
			i++;
		}
		
		
	}

	public static void main(String[] args) {
		int arr[][] = new int[4][4];
		int c  =1;
		for(int i = 0 ; i < 4 ;i++){
			for(int j = 0 ; j < 4 ;j++){
				arr[i][j] = c++;
			}
		}
		
		DiagonalTraverse obj = new DiagonalTraverse();
		obj.traverse(arr, 4, 4);
	}
}
