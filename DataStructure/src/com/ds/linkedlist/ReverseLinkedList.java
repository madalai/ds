package com.ds.linkedlist;

public class ReverseLinkedList {
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.reverse();
		list.printList();
	}

}
