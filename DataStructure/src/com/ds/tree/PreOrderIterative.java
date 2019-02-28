package com.ds.tree;

import java.util.Stack;

public class PreOrderIterative {
	 public void iterate(TreeNode node) {
			Stack<TreeNode> stack = new Stack<>();
			stack.push(node);
			while (!stack.isEmpty()) {
				TreeNode tmp = stack.pop();
				System.out.println(tmp.val);
				if (tmp.right != null) {
					stack.push(tmp.right);
				}
				if (tmp.left != null) {
					stack.push(tmp.left);
				}
			}
		}
}
