package com.ds.tree;

import com.ds.tree.BinarySearchTree.Node;

public class KthSmallestNumberInBST {
	
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(5);
		bst.insert(4);
		bst.insert(3);
		
		bst.insert(2);
		bst.insert(1);
		bst.insert(6);
		int k = bst.findKthSmallest(6);
		System.out.println(k);
		
		Node node = bst.immediateGreaterNode(bst.root.leftChild);
		System.out.println(node.key);
	}
	
	

}
