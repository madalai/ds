package com.ds.tree;

public class NextRightPointer {
	public void connect(TreeLinkNode root) {
		helper(root, null);

	}

	public void helper(TreeLinkNode root, TreeLinkNode parent) {
		
		System.out.println("Call Root:"+(root == null?null:root.val)+" Parent :"+(parent == null?null:parent.val));
		if (root == null) {
			return;
		}
		if (parent != null) {
			root.next = parent.right;
		}
		helper(root.left, root);
		helper(root.right, null);
	}
	
	public static void main(String[] args) {
		TreeLinkNode root = new TreeLinkNode(0);
		root.left = new TreeLinkNode(1);
		root.right = new TreeLinkNode(2);
		
		root.left.left = new TreeLinkNode(3);
		root.left.right = new TreeLinkNode(4);
		
		root.right.left = new TreeLinkNode(5);
		root.right.right = new TreeLinkNode(6);
		new NextRightPointer().connect(root);
		System.out.println(root);
	}
}

class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;

	TreeLinkNode(int x) {
		val = x;
	}
}
