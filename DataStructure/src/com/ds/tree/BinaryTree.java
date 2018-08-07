package com.ds.tree;


public class BinaryTree {
	Node root;
	
	public BinaryTree(){
		
	}
	
	public void insert(int key){
		root = insertRec(root,key);
	}
	
	
	private Node insertRec(Node root, int key) {
		
		if(root == null){
			root = new Node(key);
			return root;
			
		}
		if(root.key > key){
			return insertRec(root.leftChild,key);
		}
		else{
			return insertRec(root.rightChild,key);
		}
		
		
	}


	class Node{
		 int key;
		 Node leftChild;
		 @Override
		public String toString() {
			return "Node [key=" + key + "]";
		}
		Node rightChild;
		 public Node(int key){
			 this.key = key;
		 }
		}

}
