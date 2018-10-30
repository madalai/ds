package com.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KnapSack01Limited {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(reader.readLine());
         for (int p = 0; p < t; p++) {
             String row[] = reader.readLine().split(" ");
             int k = Integer.parseInt(row[0]);
             int n = Integer.parseInt(row[1]);
             int w[] = new int[n];
             int v[] = new int[n];
             for(int i = 0 ; i < n ; i++){
                 String row1[] = reader.readLine().split(" ");
                 w[i] = Integer.parseInt(row1[0]);
                 v[i] = Integer.parseInt(row1[1]);
             }
             System.out.println(helper(w,v,n,k));
           
             }
           
   }
    public static int helper(int w[],int v[],int n,int k ){
        int dp[][] = new int[n+1][k+1];
        for(int i= 0 ; i <= n ;i++){
        	for(int j=0;j<=k;j++){

                if(i==0 || j==0){dp[i][j] = 0;}
                else{
                    if(j>= w[i-1])
                    dp[i][j] = Math.max(dp[i][j-1],Math.max(dp[i-1][j],dp[i-1][j-w[i-1]]+v[i-1]));
                    else{
                        dp[i][j]= Math.max(dp[i][j-1],dp[i-1][j]);
                    }
                }
            
        	}
        }
        return dp[n][k];
    }
    
}
