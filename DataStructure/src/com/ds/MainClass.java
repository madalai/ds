package com.ds;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) throws Exception{
    	double a =-7.5;
    	System.out.println((int)a);
    	/*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         int t = Integer.parseInt(reader.readLine());
         for(int i = 0 ; i < t ;i++){
           int n = Integer.parseInt(reader.readLine());  
             String str[] = reader.readLine().split(" ");
             int arr[] = new int[n];
             for(int j = 0 ; j< n ; j++){
                 arr[j] = Integer.parseInt(str[j]);
             }
             helper(arr);
             System.out.println();
         }
     */}
     public static void helper(int arr[]){
         for(int i = 0 ; i <arr.length ; i++){
             for(int j = i+1 ; j< arr.length ; j++){
                 if(arr[i] > arr[j]){
                     System.out.print(i +" ");
                     int tmp = arr[i];
                     arr[i] = arr[j];
                     arr[j] = tmp;
                 }
             }
         }
     }
}