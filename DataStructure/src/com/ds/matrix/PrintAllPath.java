package com.ds.matrix;

public class PrintAllPath {
	
	public void printPath(char arr[][],String str,int i,int j,int m,int n){
		if(i == m-1 && j == n-1){
			System.out.println(str+arr[i][j]);
			return ;
		}
		if(i == m || j == n){
			return;
		}
		printPath(arr, str+arr[i][j], i+1, j, m, n);
		printPath(arr, str+arr[i][j], i, j+1, m, n);
		
	}
	
	public int uniquePaths(int m, int n) {
	       int arr[][] = new int[m][n];
	        for(int i = 0 ; i <m;i++){
	            for(int j = 0 ;j<n;j++){
	                if(i == 0 || j == 0){
	                    arr[i][j] = 1;
	                    
	                }
	                else{
	                    arr[i][j] = arr[i-1][j] + arr[i][j-1];
	                }
	                
	            }
	        }
	        
	        return arr[m-1][n-1];
	    }
	
	public static void main(String[] args) {
		char arr[][] = new char[3][3];
		
        arr[0][0] = 'a';
		arr[0][1] = 'b';
		arr[0][2] = 'c';
		
		arr[1][0] = 'd';
		arr[1][1] = 'e';
		arr[1][2] = 'f';
		
		arr[2][0] = 'g';
		arr[2][1] = 'h';
		arr[2][2] = 'i';
		
		PrintAllPath obj = new PrintAllPath();
		obj.printPath(arr, "", 0, 0, 3, 3);
		int n = obj.uniquePaths(3, 3);
		System.out.println("Unique paths:"+n);
	}

}
