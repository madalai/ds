package com.ds.linkedlist;

public class MergeTwoSortedLinkedList {

	public static LinkedList merge(LinkedList list1, LinkedList list2) {
		LinkedList list3 = new LinkedList();
		Node currentNode1 = list1.head;
		Node currentNode2 = list2.head;
		

		while ((currentNode1 != null) || (currentNode2 != null)) {

			if (currentNode1 == null) {

				list3.add(currentNode2.obj);
				currentNode2 = currentNode2.next;
			} else if (currentNode2 == null) {
				list3.add(currentNode1.obj);
				currentNode1 = currentNode1.next;
			} else if (currentNode1.obj < currentNode2.obj) {
				list3.add(currentNode1.obj);
				currentNode1 = currentNode1.next;
			} else {
				list3.add(currentNode2.obj);
				currentNode2 = currentNode2.next;
			}
		}
		
		return list3;
	}

}
