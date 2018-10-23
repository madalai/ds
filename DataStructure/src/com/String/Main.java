package com.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	 public static void main(String[] args) throws Exception{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(reader.readLine());
         for (int p = 0; p < t; p++) {
             int n = Integer.parseInt(reader.readLine());
             String row[] = reader.readLine().split(" ");
             int arr[] = new int[n];
             for(int i = 0 ; i < n ; i++){
                 
                 arr[i]=Integer.parseInt(row[i]);
             }
             System.out.println(helper(arr));
             }
           
         }
	 public static int helper(int arr[]){
	        if(arr.length == 0){
	            return 0;
	        }
	        if(arr.length == 1){
	            return arr[0];
	        }
	        int dp[] = new int[arr.length];
	        dp[0] = arr[0];
	        dp[1] = Math.max(arr[0],arr[1]);
	        
	        for(int i =2;i<arr.length;i++){
	            dp[i] = Math.max(dp[i-1],Math.max(dp[i-2],arr[i]+dp[i-2]));
	        }
	        return dp[arr.length-1];
	        
	    }
}
