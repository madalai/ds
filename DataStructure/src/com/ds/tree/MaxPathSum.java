package com.ds.tree;

public class MaxPathSum {
	
	 int maxSum = Integer.MIN_VALUE;
 	  public int maxPathSum(TreeNode root) {
	        helper(root);
         return maxSum;
	    }
	    
	    public int helper(TreeNode root){
	        
	        if(root.left == null && root.right == null){
	            return root.val;
	        }
	        if(root.left == null){
	            int rightSum = helper(root.right);
	            int currSum =  Math.max(Math.max(rightSum,rightSum+root.val),root.val);
	            maxSum = Math.max(maxSum,currSum);
	            return Math.max(rightSum+root.val,root.val);
	        }
	        else if(root.right == null){
	            int leftSum = helper(root.left);
	            int currSum = Math.max(Math.max(leftSum,leftSum+root.val),root.val);
	            maxSum = Math.max(maxSum,currSum);
	            return Math.max(leftSum+root.val,root.val);
	        }
	      else{
	        int leftSum = helper(root.left);
	        int rightSum = helper(root.right);
	       int currSum =  Math.max(Math.max(Math.max(Math.max(leftSum,rightSum),Math.max(leftSum+root.val,rightSum+root.val)),leftSum+rightSum+root.val),root.val);
	          maxSum = Math.max(maxSum,currSum);
	            return Math.max(Math.max(leftSum+root.val,rightSum+root.val),root.val);
	        
	      }  
	    }
    
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(-2);
		root.right = new TreeNode(-3);

		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		
		root.left.left.left = new TreeNode(-1);

		//root.left.right.left = new TreeNode(7);
		//root.left.right.right = new TreeNode(4);

		root.right.left = new TreeNode(-2);
		//root.right.right = new TreeNode(2);
		
		//root.right.right.right = new TreeNode(3);

		MaxPathSum obj = new MaxPathSum();
		System.out.println(obj.maxPathSum(root));
	}

}
