package com.ds.matrix;

public class MinPathSum {
	    public int minPathSum(int[][] grid) {
	        int m = grid.length;
	        int n = grid[0].length;
	        int[][] dp = new int[m][n];
	        
	        
	        for(int i  = 0 ; i < m ; i++){
	            for(int j = 0 ; j < n ; j ++){
	                if(i==0  && j==0){
	                    dp[i][j] = grid[i][j];
	                    continue;
	                }
	                if(i == 0){
	                    dp[i][j] = grid[i][j] + dp[i][j-1];
	                    continue;
	                }
	                if(j == 0){
	                     dp[i][j] = grid[i][j] + dp[i-1][j];
	                    continue;
	                }
	                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
	            }
	        }
	        
	        return dp[m-1][n-1];
	    }
	    
	    public static void main(String[] args) {
			int arr[][] = new int[3][3];
			arr[0][0] = 1;
			arr[0][1] = 3;
			arr[0][2] = 1;
			
			arr[1][0] = 1;
			arr[1][1] = 5;
			arr[1][2] = 1;
			
			arr[2][0] = 4;
			arr[2][1] = 2;
			arr[2][2] = 1;
			
			MinPathSum obj = new MinPathSum();
			System.out.println(obj.minPathSum(arr));
		}
	
}
