package com.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiceRollForSum {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for(int i = 0 ; i <t ;i++){
            int n = Integer.parseInt(reader.readLine());
            System.out.println(getWays(n));
        }
    }
    
    public static int getWays(int n){
        double M = 1e9+7;
        int dp[] = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i = 2 ; i <= n ;i++){
        	double sum = 0;
            for(int j=1;j<=6;j++){
                
                if(i>=j){
                     sum= (sum + dp[i-j])%M;
                }
               
            }
            dp[i] = (int)sum;
        }
        return dp[n];
    }
}
