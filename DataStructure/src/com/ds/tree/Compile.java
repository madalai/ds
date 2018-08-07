package com.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Compile {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		// List<List<Integer>> list = new Solution().levelOrderBottom(root);
		List<Double> list = new Solution().averageOfLevels(root);

		System.out.println(list);

	}

}

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
	int sum = 0;

	public TreeNode convertBST(TreeNode root) {

		traversePost(root);
		return root;

	}

	public void traversePost(TreeNode root) {
		if (root == null) {
			return;
		}
		traversePost(root.right);
		root.val = root.val + sum;
		sum = sum + root.val;
		traversePost(root.left);

	}

	public List<Double> averageOfLevels(TreeNode root) {

		List<Double> avgList = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();

		if (root == null) {
			return avgList;
		}

		queue.offer(root);

		while (!queue.isEmpty()) {
			int level = queue.size();
			int sum = 0;
			int count = 0;
			double avg = 0;
			for (int i = 0; i < level; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				sum += queue.poll().val;
				count++;
			}
			if (count != 0) {
				avg = (double) sum / count;
			}
			avgList.add(avg);
		}

		return avgList;
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null) {
			return list;
		}
		queue.offer(root);

		while (!queue.isEmpty()) {
			int level = queue.size();
			List<Integer> innerList = new ArrayList<Integer>();
			for (int i = 0; i < level; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				innerList.add(queue.poll().val);
			}
			list.add(0, innerList);
		}

		return list;

	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<>();
		if (root == null) {
			return list;
		}
		queue.offer(root);

		while (!queue.isEmpty()) {
			int level = queue.size();
			List<Integer> innerList = new ArrayList<>();

			for (int i = 0; i < level; i++) {
				if (queue.peek().left != null) {
					queue.offer(queue.peek().left);
				}
				if (queue.peek().right != null) {
					queue.offer(queue.peek().right);
				}
				innerList.add(queue.poll().val);
			}
			list.add(innerList);
		}

		return list;
	}

	public void traverseLevelOrder(TreeNode root, int height, List<Integer> levelList) {
		if (root == null) {
			return;
		}
		int nodeHeight = height(root);

		if (nodeHeight < height) {
			return;
		}
		if (nodeHeight == height) {
			levelList.add(root.val);
			return;
		}
		if (nodeHeight > height) {
			traverseLevelOrder(root.left, height, levelList);
			traverseLevelOrder(root.right, height, levelList);
		}

	}

	public int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = height(root.left);
		int right = height(root.right);

		return left > right ? left + 1 : right + 1;
	}

}