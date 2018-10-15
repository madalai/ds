package com.ds.tree;

public class RecoverBST {
	 public void recoverTree(TreeNode root) {
	        
	        helper(root,null,null,root);
	        
	    }
	    public void helper(TreeNode root,TreeNode min,TreeNode max,TreeNode treeRoot){
	        if(root == null){
	            return;
	        }
	        
	        if((max != null &&root.val > max.val) ){
	            int tmp = root.val;
	            root.val = max.val;
	            max.val =tmp;
	            helper(treeRoot,null,null,treeRoot);
	        }
	        if(min != null && root.val < min.val){
	        	int tmp = root.val;
	            root.val = min.val;
	            min.val =tmp;
	            helper(treeRoot,null,null,treeRoot);
	        }
	        helper(root.left,min,root,treeRoot);
	        helper(root.right,root,max,treeRoot);
	        
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

			RecoverBST obj = new RecoverBST();
			obj.recoverTree(root);
		}

}
