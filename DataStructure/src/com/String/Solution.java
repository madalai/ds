package com.String;

class Solution {
    int max = Integer.MAX_VALUE;
    public int maxAreaOfIsland(int[][] grid) {
        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j<grid[0].length ; j++){
                return helper(grid,i,j);
            }
        }
        
        return max;
    }
    
    public int helper(int[][] grid,int i , int j){
        if(i<0 || j<0 || i > (grid.length -1) || j > (grid[0].length -1)){
            return 0;
        }
        if(grid[i][j] == 0){
            return 0;
        }
        int temp = helper(grid,i-1,j)+helper(grid,i+1,j)+helper(grid,i,j-1)+helper(grid,i,j+1);
        if(temp > max){
            max = temp;
        }
        return temp;
    }
}