package com.ds.tree;

public class FlattenBinaryTreeToLinkedList {
	 public void flatten(TreeNode root) {
	        
		    if(root == null){
		        return;
		    }
		        flatten(root.left);
	            flatten(root.right);
		        if(root.left == null){
		            return;
		        }
		        TreeNode temp = root.right;
		        root.right = root.left;
		        
		        TreeNode lTemp = root.left;
		        
		        while(lTemp.right != null){
		            lTemp = lTemp.right;
		        }
		        lTemp.right = temp;
		        root.left = null;
	            
		        
		    }
	
	public static void main(String[] args) {
		FlattenBinaryTreeToLinkedList obj = new FlattenBinaryTreeToLinkedList();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		root.right.right = new TreeNode(6);
		
		obj.flatten(root);
		
		System.out.println(root);
	}
}
