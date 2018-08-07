package com.ds.linkedlist;

import java.util.Stack;

/**
 * Function to check if a singly linked list is palindrome
 * @author madalai
 *
 */
public class LinkedListPallendriumCheck {
	
	public static boolean isPallendrium(LinkedList list){
		Stack<Integer> stack = new Stack<>();
		Node node = list.head;
		while(node != null ){
			stack.push(node.obj);
			node = node.next;
		}
		
		Node node1 = list.head;
		
		while(node1 != null){
			Integer num = stack.pop();
			if(!num.equals(node1.obj)){
				return false;
			}
				node1 = node1.next;
			
		}
		return true;
	}

}
