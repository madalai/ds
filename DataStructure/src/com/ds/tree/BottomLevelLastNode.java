package com.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BottomLevelLastNode {
	
	 public int findBottomLeftValue(TreeNode root) {
		 if(root == null){
			 return -1;
		 }
	   
	        Queue<TreeNode> queue = new LinkedList<>();
	        
	        queue.offer(root);
	        
	        TreeNode node= new TreeNode(0);
	        while(!queue.isEmpty()){
	        	
	            node = queue.poll();
	            if(node.right != null){
	                queue.offer(node.right);
	            }
	            if(node.left != null){
	                queue.offer(node.left);
	            }
	           
	        }
	        return node.val;
			
	    }
	
	    
	    public static void main(String[] args) {
	    	
	    	BottomLevelLastNode obj = new BottomLevelLastNode();
	    	TreeNode root = new TreeNode(2);
			root.left = new TreeNode(1);
			root.right = new TreeNode(3);
			/*root.left.right = new TreeNode(4);
			root.right = new TreeNode(5);
			root.right.right = new TreeNode(6);
			root.right.right.left = new TreeNode(100);*/
			System.out.println(obj.findBottomLeftValue(root));
		}

}
