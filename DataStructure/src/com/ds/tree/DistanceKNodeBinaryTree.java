package com.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class DistanceKNodeBinaryTree {
	public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		List<TreeNode> pathList = new ArrayList<>();
		findPath(root, target, pathList);
		List<TreeNode> resultList = new ArrayList<>();

		helper(pathList.get(0), k, resultList);
		if (pathList.size() > 1) {
			for (int i = 1; i < pathList.size(); i++) {
               if( k-i == 0){
                    
            	   resultList.add(pathList.get(i));
				
               }
				else if (pathList.get(i - 1) == pathList.get(i).left) {
					helper(pathList.get(i).right, k - i - 1, resultList);
				} else {
					helper(pathList.get(i).left, k - i - 1, resultList);
				}
			}
		}
		List<Integer> finalList = new ArrayList<>();

		for (TreeNode nod : resultList) {
			finalList.add(nod.val);
		}
		return finalList;

	}

	public void helper(TreeNode root, int k, List<TreeNode> result) {
		if (root == null || k < 0) {
			return;
		}
		if (k == 0) {
			result.add(root);
			return;
		}
		helper(root.left, k - 1, result);
		helper(root.right, k - 1, result);
	}

	public boolean findPath(TreeNode root, TreeNode key, List<TreeNode> list) {
		if(root == null){
			return false;
		}
		if (root == key) {
			list.add(root);
			return true;
		}
		if (findPath(root.left, key, list) || findPath(root.right, key, list)) {
			list.add(root);
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(0);
		root.left = new TreeNode(1);
		//root.right = new TreeNode(1);

		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(2);

		//root.left.right.left = new TreeNode(7);
		//root.left.right.right = new TreeNode(4);

		//root.right.left = new TreeNode(0);
		//root.right.right = new TreeNode(2);
		
		//root.right.right.right = new TreeNode(3);

		DistanceKNodeBinaryTree obj = new DistanceKNodeBinaryTree();
		System.out.println(obj.distanceK(root, root.left.right, 1));
	}

}
