package com.ds.stack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class StockSpan {
	  static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	    static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	  public static void main(String[] args) throws Exception{
	          
	            int t = Integer.parseInt(reader.readLine());
	            for(int m = 0 ; m <t ; m++){
	                int n = Integer.parseInt(reader.readLine());
	                String s[] = reader.readLine().split(" ");
	                int arr[] = new int[n];
	                for(int i = 0 ; i < n ;i++){
	                    arr[i] = Integer.parseInt(s[i]);
	                }
	                helper(arr);
	                writer.write("\n");
	            }
	      writer.flush();
	      writer.close();
	        }
	        
	  public static void helper(int arr[]) throws IOException{
	            int g[] = new int[arr.length];
	            java.util.Stack<Integer> stack = new java.util.Stack<>();
	            for(int i = arr.length-1 ; i>=0 ; i--){
	                if(stack.isEmpty()){
	                    stack.push(i);
	                   }
	                else{
	                    while(!stack.isEmpty() && arr[i] > arr[stack.peek()]){
	                        g[stack.pop()] = i;
	                    }
	                    stack.push(i);
	                }
	            }
	            while(!stack.isEmpty()){
	                int idx = stack.pop();
	                g[idx] = -1;
	            }
	            for(int i = 0 ; i <arr.length ;i++){
	                writer.write(i-g[i]+"");
	                if(i != arr.length -1)
	                writer.write(" ");
	            }
	        }
}
