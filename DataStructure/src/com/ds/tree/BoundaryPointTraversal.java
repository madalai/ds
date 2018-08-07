package com.ds.tree;

import java.util.ArrayList;
import java.util.List;


/**
 * Given a binary tree, print boundary nodes of the binary tree Anti-Clockwise
 * starting from the root.
 * 
 * @author madalai
 *
 */
public class BoundaryPointTraversal {



	public void boundaryTraverse(Node root) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> rightList = new ArrayList<>();
		list.add(root.key);

		helperLeft(root.left, list);
		helperEdge(root,list);
		helperRight(root.right, list);    
		
		/*for(int i = rightList.size()-1 ; i >= 0 ; i--){
			list.add(rightList.get(i));
		}*/
		System.out.println(list);
	}

	private void helperLeft(Node root, List<Integer> list) {
		if (root == null || (root.left == null && root.right == null)) {
			return;
		}
		list.add(root.key);
		if (root.left != null) {
			helperLeft(root.left, list);
		} else {
			helperLeft(root.right, list);
		}

		
	}

	private void helperEdge(Node root,List<Integer> list) {
		if(root == null){return;}
		if(root.left == null  && root.right == null){
			list.add(root.key);
			return;
		}
		helperEdge(root.left, list);
		helperEdge(root.right, list);

	}

	private void helperRight(Node root, List<Integer> list) {
		if (root == null || (root.left == null && root.right == null)) {
			return;
		}
		
		if (root.right != null) {
			helperRight(root.right, list);
			list.add(root.key);
		} else {
			helperRight(root.left, list);
			list.add(root.key);
		}
	}

	public static void main(String[] args) {
		BoundaryPointTraversal obj  =  new BoundaryPointTraversal();
		Node root = new Node(20);
		root.left = new Node(8);
		root.left.left = new Node(4);
		root.left.right = new Node(12);
		root.left.right.left = new Node(10);
		root.left.right.right = new Node(14);
		
		root.right = new Node(22);
		root.right.right = new Node(25);
		
		obj.boundaryTraverse(root);
		
	}
}
class Node{
	int key;
	Node left,right;
	public Node(int key){
		this.key = key;
	}
	
}

