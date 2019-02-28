package com.ds.tree;

import java.util.HashSet;
import java.util.Set;

public class LCAInBinaryTree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(22);
		root.left = new TreeNode(11);
		root.left.right = new TreeNode(23);
		root.left.left = new TreeNode(535);
		root.right = new TreeNode(55);
		root.right.left = new TreeNode(77);
		root.right.left.right = new TreeNode(99);
		LCAInBinaryTree obj = new LCAInBinaryTree();
		System.out.println(obj.lca(root, 11, 77));
	}

	public int lca(TreeNode root, Integer B, Integer C) {
		TreeNode node = helper(root, B, C);
		Set<Integer> set = new HashSet<>();
		traverse(root, set);
		if (!set.contains(B) || !set.contains(C)) {
			return -1;
		}
		return node == null ? -1 : node.val;
	}

	public void traverse(TreeNode root, Set<Integer> set) {
		if (root == null) {
			return;
		}
		set.add(root.val);
		traverse(root.left, set);
		traverse(root.right, set);
	}

	public TreeNode helper(TreeNode root, int B, int C) {
		if (root == null) {
			return root;
		}
		if (root.val == B || root.val == C) {
			return root;
		}
		TreeNode left = helper(root.left, B, C);
		TreeNode right = helper(root.right, B, C);
		if (left != null && right != null) {
			return root;
		}
		if (left != null) {
			return left;
		}
		if (right != null) {
			return right;
		}
		return null;
	}

}
