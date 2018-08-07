package com.ds.tree;

public class Main {
public static void main(String[] args) {
	BinarySearchTree bst = new BinarySearchTree();
	bst.insert(10);
	bst.insert(5);
	bst.insert(15);
	bst.insert(4);
	bst.insert(7);
	bst.insert(11);
	bst.insert(16);
	/*System.out.println(bst.root.key);
	System.out.println(bst.root.leftChild);
	System.out.println(bst.root.rightChild);*/
	
bst.levelOrderTraversing();
//System.out.println("Height ="+bst.height(bst.root));
}
}
