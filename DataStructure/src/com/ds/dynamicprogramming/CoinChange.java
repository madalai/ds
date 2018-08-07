package com.ds.dynamicprogramming;

public class CoinChange {

	public static void main(String[] args) {
		int arr[] = {2};
		System.out.println(coinChange(arr, 3));
		
		
	}
	  public static int coinChange(int[] coins, int amount) {
	        if(coins.length > 0 && amount == 0){
	            return 0;
	        }
	        int a[] = new int[amount+1];
	       int b[] = new int[amount+1];
	        a[0] = 0;
	        b[0] = -1;
	        
	        for(int i = 1 ; i<= amount ;i++){
	            a[i] = Integer.MAX_VALUE-1;
	            b[i] = -1;
	           
	        }
	        
	        for(int j = 0 ; j< coins.length ; j++){
	            for(int k = 1 ; k <= amount ;k++){
	                if(k >= coins[j]){
	                    if(1+a[k-coins[j]] < a[k]){
	                    a[k] = 1+a[k-coins[j]];
	                    b[k] = j;
	                    }
	                }
	            }
	        }
	        
	        return a[amount] != Integer.MAX_VALUE-1 ? a[amount]:-1;
	        
	    }
}
