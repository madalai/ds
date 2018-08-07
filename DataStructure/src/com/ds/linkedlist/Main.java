package com.ds.linkedlist;

public class Main {
public static void main(String[] args) {
	/*LinkedList linkedList = new LinkedList();
	linkedList.add(1);
	linkedList.add(2);
	linkedList.add(3);
	linkedList.add(4);
	linkedList.add(3);
	linkedList.add(2);
	linkedList.add(1);
	
	linkedList.printList();
	
	System.out.println(LinkedListPallendriumCheck.isPallendrium(linkedList));*/
	
	/*//Loop Testing
	
	LinkedList list = new LinkedList();
    list.head = new Node(50);
    list.head.next = new Node(20);
    list.head.next.next = new Node(15);
    list.head.next.next.next = new Node(4);
    list.head.next.next.next.next = new Node(10);*/

   /* // Creating a loop for testing 
    list.head.next.next.next.next.next = list.head.next.next;
    list.loopExist();
	list.printList();*/
	
	LinkedList list1 = new LinkedList();
	list1.add(1);
	
	list1.add(3);
	
	
	list1.add(5);
	list1.add(7);
	
	
	LinkedList list2 = new LinkedList();
	list2.add(2);
	
	list2.add(4);
	
	
	list2.add(6);
	list2.add(8);
	
	LinkedList list3 = MergeTwoSortedLinkedList.merge(list1, list2);
	list3.printList();
	
	
	
	
}
}
