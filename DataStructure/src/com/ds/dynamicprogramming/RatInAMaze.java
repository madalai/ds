package com.ds.dynamicprogramming;

public class RatInAMaze {
	
	public static void findWayOutOfMaze(int[][] maze,int width,int height){
		
		int[][] matrix = new int[width][height];
		for(int i =0;i<width;i++){
			for(int j = 0;j<height;j++){
				if(i == 0 || j ==0){
					if(i>j){
						if(matrix[i-1][j] != 0 && maze[i][j] !=0){
						matrix[i][j] = 1;
						}
						else{
							matrix[i][j] = 0;
						}
					}
					else if(i<j){
						if(matrix[i][j-1] !=0 && maze[i][j] !=0){
							matrix[i][j] = 1;
						}
						else{
							matrix[i][j] = 0;
						}
					}
					else{
						matrix[i][j] = 1;
					}
				}
				else{
					if(maze[i][j] != 0){
					matrix[i][j] = matrix[i-1][j]+matrix[i][j-1];
					}
					else{
						matrix[i][j] = 0;
					}
				}
			}
		}
		printPath(matrix,width,height);
	}

	private static void printPath(int[][] matrix,int width,int height) {
		for(int i = 0 ; i<width;i++){
			for(int j = 0;j<height;j++){
				if(matrix[i][j] == 1){
					System.out.println("Point ["+i+"]["+j+"]");
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		int[][] maze = new int[4][4];
		for(int i = 0;i<4;i++){
			for(int j = 0;j<4;j++){
				maze[i][j] = 0;
			}
		}
		maze[0][0] = 1;
		maze[1][0] = 1;
		maze[1][1] = 1;
		maze[2][1] = 1;
		maze[3][1] = 1;
		maze[3][2] = 1;
		maze[3][3] = 1;
		findWayOutOfMaze(maze, 4, 4);
		
		
	}

}
