package com.ds.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PathBetweenTwoNodes {
public static void main(String[] args) {
	TreeNode root = new TreeNode(1);
	root.left = new TreeNode(2);
	root.right = new TreeNode(3);
	
	root.left.left = new TreeNode(4);
	root.left.right = new TreeNode(5);
	
	//root.right.left = new TreeNode(4);
	root.right.right = new TreeNode(6);
	root.right.right.left = new TreeNode(8);
	
	root.left.right.left = new TreeNode(10);
	root.left.right.right = new TreeNode(7);
	
	TreeNode node1 = root.left.right.right;
	TreeNode node2 = root.right.right.left ;
	
	System.out.println(findPath(root, node1, node2));
	
	
	
}
	public static int findPath(TreeNode root,TreeNode node1,TreeNode node2){
		List<Integer> list1 = new ArrayList<Integer>();
		helper(root,node1,list1);
		List<Integer> list2 = new ArrayList<Integer>();
		helper(root,node2,list2);q
		
		for(int i = 0 ; i < list1.size() ;i++){
			if(!list2.contains(list1.get(i))){
				list2.add(list1.get(i));
			}
		}
		System.out.println(list2);
		return list2.size()-1;
		
	}

	private static boolean helper(TreeNode root, TreeNode key, List<Integer> list) {
		if(root == null){
			return false;
		}
		if(root == key){
			
			list.add(root.val);
			return true;
		}
		boolean found = helper(root.left, key, list) || helper(root.right, key, list);
		if(found){
			list.add(root.val);
		}
		return found;
		
		
	}
}
