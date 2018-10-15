package com.ds.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiameterOfTree {
	   private int max = 0;
	     public static void main(String[] args) throws Exception{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	          int t = Integer.parseInt(reader.readLine());
	          for(int i=0 ; i < t ;i++){
	              int n = Integer.parseInt(reader.readLine());
	              String str = reader.readLine();
	              int arr[] = new int[n];
	              int j = 0;
	              for(String s : str.split(" ")){
	                  arr[j] = Integer.parseInt(s);
	                  j++;
	              }
	              TreeNode root = constructTree(arr);
	              max = 0;
	              helper(root);
	              System.out.println(max);
	              
	          }

	      }
	    
	    
	    public static int helper(TreeNode root){
	        if(root == null){
	            return -1;
	        }
	        int left = 1 + helper(root.left);
	        int right = 1 + helper(root.right);
	        
	        max = Math.max(max,left+right);
	        return Math.max(left , right);
	    }
	    
	        public static TreeNode constructTree(int arr[]){
	        if(arr == null || arr.length == 0){
	            return null;
	        }
	        TreeNode root = new TreeNode(arr[0]);
	        for(int i = 1 ; i < arr.length ; i++){
	            insert(root,arr[i]);
	        }
	        return root;
	        
	    }
	    public static TreeNode insert(TreeNode root,int data){
	        if(root == null){
	            return new TreeNode(data);
	        }
	        if(data < root.data){
	           root.left = insert(root.left,data);
	        }
	        else{
	            root.right = insert(root.right,data);
	        }
	        return root;
	    }  
	}
	
}
