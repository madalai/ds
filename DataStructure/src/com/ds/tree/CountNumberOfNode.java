package com.ds.tree;

public class CountNumberOfNode {
	public int countNodes(TreeNode root) {
	      int left = left(root);
	      int right = right(root);
	        
	      if(left == right){
	          return (1 << left)-1;
	      }
	        return countNodes(root.left) + countNodes(root.right) +1;
	        
	    }
	    
	    public int left(TreeNode root){
	        int h = 0 ; 
	        while(root!=null){
	            h++;
	            root = root.left;
	        }
	        return h;
	    }
	    public int right(TreeNode root){
	       int h = 0 ; 
	        while(root!=null){
	            h++;
	            root = root.right;
	        }
	        return h; 
	    }
	    
public static void main(String[] args) {
	TreeNode root = new TreeNode(0);
	root.left = new TreeNode(1);
	root.right = new TreeNode(2);
	
	root.left.left = new TreeNode(3);
	root.left.right = new TreeNode(4);
	
	root.right.left = new TreeNode(5);
	root.right.right = new TreeNode(6);
	int n = new CountNumberOfNode().countNodes(root);
	System.out.println(n);
}
}
