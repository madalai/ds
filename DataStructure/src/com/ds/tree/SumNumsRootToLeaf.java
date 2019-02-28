package com.ds.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SumNumsRootToLeaf {
	static int M = 1000000007;
	  public static void main(String[] args) throws Exception {
	       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	       int t = Integer.parseInt(reader.readLine());

	       for (int i = 0; i < t; i++) {
	           int n = Integer.parseInt(reader.readLine());
	           String s[] = reader.readLine().split(" ");
	           int arr[] = new int[n];
	           for (int j = 0; j < n; j++) {
	               arr[j] = Integer.parseInt(s[j]);
	           }
	           TreeNode root = constructTree(arr);
	           
	           System.out.println(sum(root,0));
	       }
	   }
	   static int sum(TreeNode root,long currSum){
	       if(root == null){
	           return 0;
	       }
	       String tmp = root.val+"";
	           int n = tmp.length();
	           currSum = ((currSum*(int)Math.pow(10,n)%M)%M+root.val)%M;
	       if(root.left == null && root.right == null){
	           return (int)currSum;
	       }
	      
	       return (sum(root.left,currSum) + sum(root.right,currSum))%M;
	   }
	  static TreeNode constructTree(int arr[]) {
	       TreeNode root = new TreeNode(arr[0]);
	       for (int i = 1; i < arr.length; i++) {
	           insert(root, arr[i]);
	       }
	       return root;
	   }

	   static TreeNode insert(TreeNode root, int val) {
	       if (root == null) {
	           return new TreeNode(val);
	       }
	       if (root.val > val) {
	           root.left = insert(root.left, val);
	       } else {
	           root.right = insert(root.right, val);
	       }
	       return root;

	   }


}

