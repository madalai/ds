package com.ds.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Smart {
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
	              TreeNode1 root = constructTree(arr);
	              int height = height(root);
	              
	              System.out.println(height);
	              
	          }

	      }
	    public static int height(TreeNode1 root){
	        if(root == null){
	            return 0;
	        }
	        
	        return 1+ Math.max(height(root.left),height(root.right));
	    }
	    public static TreeNode1 constructTree(int arr[]){
	        if(arr == null || arr.length == 0){
	            return null;
	        }
	        TreeNode1 root = new TreeNode1(arr[0]);
	        for(int i = 1 ; i < arr.length ; i++){
	            insert(root,arr[i]);
	        }
	        return root;
	        
	    }
	    public static TreeNode1 insert(TreeNode1 root,int data){
	        if(root == null){
	            return new TreeNode1(data);
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
	class TreeNode1{
	    int data;
	    TreeNode1 left;
	    TreeNode1 right;
	    
	    public TreeNode1(int data){
	        this.data = data;
	    }
	}
