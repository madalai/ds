package com.ds.dynamicprogramming;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class SubsetSumProblem {
	  public static void main(String[] args) throws Exception {
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(reader.readLine());
	        for (int i = 0; i < t; i++) {
	            String s[] = reader.readLine().split(" ");
	            int n = Integer.parseInt(s[0]);
	            int sum = Integer.parseInt(s[1]);
	            String s1[] = reader.readLine().split(" ");
	            int arr[] = new int[n];
	            for (int j = 0; j < s1.length; j++) {
	                arr[j] = Integer.parseInt(s1[j]);
	            }
	            System.out.println(isSumExisits(arr, sum, n) ? "YES" : "NO");
	        }
	    }

	    public static boolean isSumExisits(int arr[], int sum, int n) {
	        boolean mat[][] = new boolean[n+1][sum + 1];
	        mat[0][0] = true;
	        for(int j = 1;j<=sum;j++){
	            mat[0][j] = false;
	        }
	        for(int i = 1;i<=n;i++){
	            mat[i][0] = true;
	        }
	        boolean flag = false;
	        for(int i = 1;i<=n;i++){
	            flag = false;
	            for(int j = 1;j<=sum;j++){
	            	if((j-arr[i-1]>=0) && mat[i][j-arr[i-1]]){
	                    mat[i][j] = true;
	                    flag = true;
	                }
	                else{
	                    mat[i][j] = mat[i-1][j];
	                }
	            }
	        }
	        return mat[n][sum];

	    }
}
