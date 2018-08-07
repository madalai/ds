package com.String;

/**
 * Given two words word1 and word2, find the minimum number of operations
 * required to convert word1 to word2.
 * 
 * You have the following 3 operations permitted on a word:
 * 
 * Insert a character Delete a character Replace a character
 * 
 * @author madalai
 *
 */
public class EditDistance {
	  int min = Integer.MAX_VALUE;

		public int minDistance(String word1, String word2) {

			return solveDp(word1,word2);
		/*	if (word1.isEmpty() || word2.isEmpty()) {
				return Math.max(word1.length(), word2.length());
			}
			int i = word1.length() - 1;
			int j = word2.length() - 1;
			helper(word1, word2, i, j, 0);

			return min;*/

		}

		private int solveDp(String word1, String word2) {
			int m = word1.length()+1;
			int n = word2.length()+1;
			int dp[][] = new int[m][n];
			
			for(int i = 0 ; i < m ;i ++){
				for(int j = 0 ; j < n;j++){
					if(i == 0  && j == 0){
						dp[i][j] = 0;
						continue;
					}
					if(i == 0){
						dp[i][j] = dp[i][j-1] + 1;
						continue;
					}
					if(j == 0){
						dp[i][j] = dp[i-1][j] +1;
						continue;
					}
					if(word1.charAt(i-1) == word2.charAt(j-1)){
						dp[i][j] = dp[i-1][j-1];
					}
					else{
						dp[i][j] = Math.min((Math.min(dp[i-1][j], dp[i-1][j-1])), dp[i][j-1])+1;
					}
				}
			}
			
			return dp[m-1][n-1];
			
		}

		private void helper(String s1, String s2, int i, int j, int count) {
		System.out.println("i = "+i+"j = "+j);
	        
	        if(i < 0  && j < 0 ){
	            if (count < min) {
					min = count;

				}
				return;
	        }

			if (i < 0) {
				count = count + j +1;
				if(count < min){
					min = count;
				}
				return;
			}
			if (j < 0) {
				count = count + i +1;
				if(count < min){
					min = count;
				}
				return;
			} else {
				if (s1.charAt(i) == s2.charAt(j)) {
					helper(s1, s2, i - 1, j - 1, count);
				} else {
					// append
					helper(s1, s2, i, j - 1,count + 1);
					// remove
					helper(s1, s2, i - 1, j, count + 1);
					// replace
					helper(s1, s2, i - 1, j - 1,count + 1);

				}
			}
	}

	public static void main(String[] args) {
		EditDistance obj = new EditDistance();
		int n = obj.minDistance("dinitrophenylhydrazine", "benzalphenylhydrazone");
		System.out.println(n);
	}
}
