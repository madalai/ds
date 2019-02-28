package com.ds.stack;

import java.util.Stack;

public class NextGreater {
	public static void main(String[] args) {
		int arr[] = {2,5,3,1,99,56,77};
		Stack<Integer> stack = new Stack<>();
		int g[] = new int[arr.length];
		
		for(int i=0;i<arr.length ;i++){
			
				while(!stack.isEmpty() && arr[stack.peek()] < arr[i]){
					g[stack.pop()] = arr[i];
				}
			
			stack.push(i);
		}
		while(!stack.isEmpty()){
			g[stack.pop()] = Integer.MIN_VALUE;
		}
		for(int i=0;i< arr.length ;i++)
		System.out.println(arr[i]+"->"+g[i]);
		
	}

}
