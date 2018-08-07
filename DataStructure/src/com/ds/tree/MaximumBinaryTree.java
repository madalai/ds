package com.ds.tree;

/**
 * Given an integer array with no duplicates. A maximum tree building on this
 * array is defined as follow:
 * 
 * The root is the maximum number in the array. The left subtree is the maximum
 * tree constructed from left part subarray divided by the maximum number. The
 * right subtree is the maximum tree constructed from right part subarray
 * divided by the maximum number. Construct the maximum tree by the given array
 * and output the root node of this tree.
 * 
 * @author madalai
 *
 */
public class MaximumBinaryTree {

	public TreeNode constructMaximumBinaryTree(int[] nums) {

		return maxTree(nums, 0, nums.length-1);

	}

	public TreeNode maxTree(int[] nums, int start, int end) {
		if(start < 0 || end < 0 || end <start){
			return null;
		}
		if(start == end){
			return new TreeNode(nums[end]);
		}
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = start; i <= end; i++) {
			if (nums[i] > max) {
				max = nums[i];
				idx = i;
			}
		}
		TreeNode root = new TreeNode(max);
		root.left = maxTree(nums, start, idx - 1);
		root.right = maxTree(nums, idx + 1, end);

		return root;
	}
	
	
	public static void main(String[] args) {
		MaximumBinaryTree obj = new MaximumBinaryTree();
		int arr[] = {3,2,1,6,0,5};
		TreeNode root = obj.constructMaximumBinaryTree(arr);
		System.out.println(root);
	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}


