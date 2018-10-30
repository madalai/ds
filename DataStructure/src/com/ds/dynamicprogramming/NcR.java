package com.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class NcR {

    static double M = 1e9 + 7;
    static int dp[][];
    public static void main(String[] args) throws Exception{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        Map<Integer,Integer> map = new LinkedHashMap<>();
        int maxKey = 0;
        int maxValue = 0;
        for (int i = 0; i < t; i++) {
            String s[] = reader.readLine().split(" ");
            int key = Integer.parseInt(s[0]);
            int value = Integer.parseInt(s[1]);
            if (key > maxKey) {
                maxKey = key;
            }
            if(value > maxValue){
                maxValue = value;
            }
            map.put(key,value);
        }
        helper(maxKey,maxValue);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key1 = entry.getKey();
            int value1 = entry.getValue();
            System.out.println(dp[key1][value1]);
        }

    }
    public static void helper(int n,int r){
        dp = new int[n+1][r+1];
        
        for(int i = 0 ; i<= n ;i++){
            for(int j = 0 ; j <= r ;j++){
                if(j>i  || i==0){
                    dp[i][j]=0;
                   
                }
               else if(j == 0 || i==j){
                    dp[i][j] =1 ;
                  
                }
               else
                dp[i][j] =  (int) ((int) ((dp[i-1][j])%M+(dp[i-1][j-1])%M)%M);
            }
          
        }
    }
}
