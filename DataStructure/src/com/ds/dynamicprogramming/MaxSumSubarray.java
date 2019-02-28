package com.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MaxSumSubarray {

    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(reader.readLine());
         
         for (int i = 0; i < t; i++) {
             int n = Integer.parseInt(reader.readLine());
             String s[] = reader.readLine().split(" ");
             int arr[] = new int[n];
             for(int j=0;j<n;j++){
                 arr[j] = Integer.parseInt(s[j]);
             }
             helper(arr,n);
         }
         
     }
     
     static void helper(int arr[],int n){
         int dp[] = new int[n];
         dp[0] = arr[0];
         int max = arr[0];
         for(int i = 1;i<n;i++){
             dp[i] = Math.max(arr[i],dp[i-1]+arr[i]);
             max = Math.max(max,dp[i]);
         }
         System.out.print(max);
          System.out.print(" ");
    
         List<Integer> list = new ArrayList<>();
         int tmp = max;
         for(int i=n-1;i>=0;i--){
             if(dp[i] == max){
                 list.clear();
                 list.add(i);
                 tmp = max - arr[i];
             }
             else if(dp[i] == tmp){
                 list.add(i);
                 tmp = tmp-arr[i];
                 
             }
             
         }
         if(list.size() == 1){
             System.out.println(list.get(0)+" "+list.get(0));
         }else{
         System.out.println(list.get(list.size()-1) +" "+list.get(0));
         }
          
     }
}
