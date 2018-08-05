package com.ds.dynamicprogramming;

public class WordSearch {

	boolean flag;
	public boolean exist(char[][] board, String word) {

		String choose = "";
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				char c = board[i][j];
				
					flag = search(board, word, choose, i, j);
					if(flag){
						return true;
					}
				} 
			}
		return flag;
		}
		

	

	

	public boolean search(char[][] board, String word, String choose, int i, int j) {
		if (i < 0 || i == board.length || j < 0 || j == board[0].length) {
			return false;
		}
		if(board[i][j] == word.charAt(choose.length()+1)){
			choose = choose+board[i][j];
		}
		
		if (choose.length() == word.length()) {
			return true;
		}
		

		return search(board, word, choose, i + 1, j) || search(board, word, choose, i, j + 1) ||

				search(board, word, choose, i - 1, j) || search(board, word, choose, i, j - 1);
	}
	
	
	public static void main(String[] args) {
		char[][] board = new char[3][4];
		board[0][0] = 'A';
		board[0][1] = 'B';
		board[0][2] = 'C';
		board[0][3] = 'E';
		
		board[1][0] = 'S';
		board[1][1] = 'F';
		board[1][2] = 'C';
		board[1][3] = 'S';
		
		board[2][0] = 'A';
		board[2][1] = 'D';
		board[2][2] = 'E';
		board[2][3] = 'E';
		
		WordSearch obj = new WordSearch();
		System.out.println(obj.exist(board, "ABSFS"));
		
		
	}
}