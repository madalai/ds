package com.ds.tree;

public class BinaryTreePruning {
	 public TreeNode pruneTree(TreeNode root) {
	        helper(root);
	        return root;
	    }
	    
	    public boolean helper(TreeNode root){
	        if(root == null){return false;}
	        boolean left = helper(root.left);
	        boolean right = helper(root.right);
	        if(root.val == 1){return true;}
	        
	        
	        if(!(left || right)){
	            root = null;
	        }
	        return false;
	    }
	    
	    public static void main(String[] args) {
			TreeNode root  = new TreeNode(1);
			root.right = new TreeNode(0);
			root.right.left = new TreeNode(0);
			root.right.right = new TreeNode(1);
			
			System.out.println(new BinaryTreePruning().pruneTree(root));
			
		}
}
