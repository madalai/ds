package com.ds.randomalgos;

import java.util.ArrayList;
import java.util.List;

public class CoinChange {
public static void main(String[] args) {
	int arr[] = {1,3,5};
	System.out.println(count(arr, 3, 5));
	coinChange(arr, 5);
}
	public static int coinChange(int arr[], int sum) {
		List<String> ways = new ArrayList<>();
		helper(arr, sum, 0, "", ways);
		for (String s : ways) {
			System.out.println(s);
		}
		return ways.size();
	}

	private static void helper(int[] arr, int given, int choosen, String choosenString, List<String> list) {

		if (given == choosen) {
			list.add(choosenString);
			return;
		}
		if (choosen > given) {
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			helper(arr, given, choosen + arr[i], choosenString +","+ arr[i], list);
		}
	}
	
	static int count( int S[], int m, int n ) 
    { 
        // If n is 0 then there is 1 solution  
        // (do not include any coin) 
        if (n == 0) 
            return 1; 
          
        // If n is less than 0 then no  
        // solution exists 
        if (n < 0) 
            return 0; 
      
        // If there are no coins and n  
        // is greater than 0, then no 
        // solution exist 
        if (m <=0 && n >= 1) 
            return 0; 
      
        // count is sum of solutions (i)  
        // including S[m-1] (ii) excluding S[m-1] 
        return count( S, m - 1, n ) + 
               count( S, m, n-S[m-1] ); 
    } 
}
