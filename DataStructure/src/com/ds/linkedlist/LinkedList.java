package com.ds.linkedlist;

public class LinkedList {
	private static int length = 0;
	public Node head;

	public void add(int i) {
		if (head == null) {
			head = new Node(i);
			length++;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;

		}
		currNode.next = new Node(i);
		length++;
		return;

	}

	public static int getLength() {
		return length;
	}

	public static void setLength(int length) {
		LinkedList.length = length;
	}

	public void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.obj);
			System.out.print(",");
			currNode = currNode.next;
			;
		}
		System.out.println();

	}

	public boolean loopExist() {
		Node slow = head;
		Node fast = head.next;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				System.out.println("Loop Found");
				removeDuplicate(slow);
				return true;
			}
		}

		return false;
	}

	private void removeDuplicate(Node slow) {
		/*
		 * int noOfNodesInLoop = 1; Node currNode = slow; while(currNode.next !=
		 * slow){ noOfNodesInLoop++; currNode = currNode.next; }
		 * 
		 * Node tempNode = head; for(int i = 1; i<= noOfNodesInLoop ; i++){
		 * tempNode = tempNode.next; }
		 */
		Node node1 = head;
		Node node2 = slow;
		boolean found = false;
		while (!found && node1.next != slow) {
			while (node2.next != slow) {
				if (node1.next == node2.next) {
					break;
				}
				node2 = node2.next;

			}

			node1 = node1.next;
		}
		
		node2.next = null;

	}
	
	public void reverse(){
		Node curr = head;
		Node prev = null;
		Node next = null;
		
		while(curr != null){
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		
	}

	public Node getHead() {
		return head;
	}

	
}

 
