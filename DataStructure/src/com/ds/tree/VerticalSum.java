package com.ds.tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VerticalSum {

	public void verticalSum(TreeNode root){
		Map<Integer,Integer> map = new HashMap<>();
		helper(root,0,map);
		
		System.out.println("**********Vertical Sum*************");
		
		for(Entry<Integer,Integer> entry: map.entrySet()){
			System.out.println(entry.getKey() +"  :  "+entry.getValue());
		}
	}

	private void helper(TreeNode root, int key, Map<Integer, Integer> map) {
		while(root == null)return;
		if(!map.containsKey(key)){
			map.put(key, 0);
		}
		map.put(key, map.get(key)+root.val);
		helper(root.left, key-1, map);
		helper(root.right, key+1, map);
		
	}
	
	public static void main(String[] args) {
		TreeNode root  = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(13);
		
		root.right = new TreeNode(6);
		root.right.left = new TreeNode(9);
		root.right.right = new TreeNode(11);
		
		VerticalSum obj = new VerticalSum();
		obj.verticalSum(root);
	}
}
