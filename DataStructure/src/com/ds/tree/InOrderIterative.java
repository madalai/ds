package com.ds.tree;

import java.util.Stack;

public class InOrderIterative {

	public void iterate(TreeNode root){
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode curr = stack.peek();
			while(curr != null){
				if(curr.left != null){
					stack.push(curr.left);
				}
				curr = curr.left;
			}
			TreeNode tmp = stack.pop();
			System.out.println(tmp.val);
			
			stack.push(tmp.right);
			
			
		}
	}
}
