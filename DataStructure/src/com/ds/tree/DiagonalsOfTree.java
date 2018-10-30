package com.ds.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://www.geeksforgeeks.org/diagonal-traversal-of-binary-tree/
 * 
 * @author madalai
 *
 */
public class DiagonalsOfTree {

	public static Map<Integer, List<Integer>> printDiagonal(TreeNode11 root, Map<Integer, List<Integer>> map,
			int dist) {
		if (root == null)
			return map;
		if (map == null) {
			map = new HashMap<>();

		}
		if (!map.containsKey(dist)) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(root.val);
			map.put(dist, list);
		} else {
			map.get(dist).add(root.val);
		}
		printDiagonal(root.left, map, dist + 1);
		printDiagonal(root.right, map, dist);
		return map;
	}

	public static void main(String[] args) {
		TreeNode11 root = new TreeNode11(0);
		root.left = new TreeNode11(1);
		root.right = new TreeNode11(1);

		root.left.left = new TreeNode11(3);
		root.left.right = new TreeNode11(2);

		root.left.right.left = new TreeNode11(7);
		root.left.right.right = new TreeNode11(4);

		root.right.left = new TreeNode11(0);
		root.right.right = new TreeNode11(2);

		root.right.right.right = new TreeNode11(3);
		Map<Integer, List<Integer>> map = printDiagonal(root, null, 0);
		for(Map.Entry<Integer, List<Integer>> entry:map.entrySet()){
			System.out.println("Diagonal "+entry.getKey());
			System.out.println(entry.getValue());
		}

	}
}

class TreeNode11 {
	int val;
	TreeNode11 left;
	TreeNode11 right;

	public TreeNode11(int val) {
		this.val = val;
	}
}