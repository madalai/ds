package com.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
	Node root = null;
	int kthSmallest;
	boolean isFound = false;

	List<Node> nodeList;

	public BinarySearchTree() {

	}

	public void insert(int key) {

		root = insertRec(root, key);

	}

	private Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key <= root.key) {
			root.leftChild = insertRec(root.leftChild, key);
			return root;
		} else {
			root.rightChild = insertRec(root.rightChild, key);
			return root;

		}
	}

	class Node {
		int key;
		Node leftChild;

		@Override
		public String toString() {
			return "Node [key=" + key + "]";
		}

		Node rightChild;

		public Node(int key) {
			this.key = key;
		}
	}

	public void preOrderTraverse() {
		traversePreOrder(root);
	}

	// Root >> Left >> Right
	private void traversePreOrder(Node root) {

		if (root != null) {
			System.out.print(root.key);
			System.out.println(",");

			traversePreOrder(root.leftChild);

			traversePreOrder(root.rightChild);
		}
	}

	public void postOrderTraverse() {
		traversePostOrder(root);
	}

	private void traversePostOrder(Node root) {

		if (root != null) {
			traversePostOrder(root.leftChild);
			traversePostOrder(root.rightChild);
			System.out.println(root.key);

		}

	}

	public void inOrderTraverse() {
		traverseInOrder(root);
	}

	private void traverseInOrder(Node root) {
		if (root != null) {
			traverseInOrder(root.leftChild);
			System.out.println(root.key);
			traverseInOrder(root.rightChild);
		}

	}

	// Using QUEUE
	public void levelOrderTraverseUsingQueue() {
		Queue<Node> queue = new LinkedList<>();
		Node tmp = root;

		while (tmp != null) {
			System.out.println(tmp.key);
			queue.add(tmp.leftChild);
			queue.add(tmp.rightChild);

			tmp = queue.poll();
		}
	}

	public void levelOrderTraversing() {

		// traverseLevelOrder(root,height(root));
		int height = height(root);
		for (int i = height; i > 0; i--) {
			traverseLevelOrder(root, i);
		}

	}

	private void traverseLevelOrder(Node node, int heightToBePrinted) {

		int nodeHeight = height(node);

		if (nodeHeight < heightToBePrinted) {
			return;
		}

		if (node == null) {
			return;
		}
		if (nodeHeight == heightToBePrinted) {
			System.out.println(node.key);
		}

		if (nodeHeight > heightToBePrinted) {
			traverseLevelOrder(node.leftChild, heightToBePrinted);
			traverseLevelOrder(node.rightChild, heightToBePrinted);
		}
	}

	public int height(Node node) {

		if (node == null) {
			return 0;
		}
		int lHight = height(node.leftChild);
		int rHight = height(node.rightChild);

		if (lHight > rHight) {
			return lHight + 1;
		} else {
			return rHight + 1;
		}
	}

	public Integer findKthSmallest(int k) {
		nodeList = new ArrayList<>();

		populateArrayInSortingOrder(root);
		return nodeList.get(k - 1).key;
	}

	private void populateArrayInSortingOrder(Node root2) {

		if (root2 != null) {
			populateArrayInSortingOrder(root2.leftChild);
			nodeList.add(root2);

			populateArrayInSortingOrder(root2.rightChild);
		}

	}

	public Node immediateGreaterNode(Node node) {
		nodeList = new ArrayList<>();

		populateArrayInSortingOrder(root);
		int k = findPos(node, 0, nodeList.size() - 1);

		return nodeList.get(k + 1);

	}

	private int findPos(Node node, int start, int end) {

		if (node.key == nodeList.get(start).key) {
			return start;
		} else {
			int mid = (end + start) / 2;
			if (node.key == nodeList.get(mid).key) {
				return mid;
			}

			if (node.key > nodeList.get(mid).key) {
				return findPos(node, mid+1, end);
			} else {
				return findPos(node, start, mid - 1);
			}
		}

	}

}
