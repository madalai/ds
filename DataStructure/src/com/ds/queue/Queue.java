package com.ds.queue;

import com.ds.linkedlist.LinkedList;
import com.ds.linkedlist.Node;

/**
 * FIFO
 * @author madalai
 *
 */
public class Queue {

	private LinkedList list = new LinkedList();
	public void enqueue(Integer data){
		list.add(data);
		
	}
	
	public Integer deueue(){
		if(list.head == null){
			return null;
		}
		Node node = list.head;
		list.head = node.next;
		return node.obj;
	}

}
