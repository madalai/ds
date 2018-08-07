package com.ds.linkedlist;

import java.util.HashMap;
import java.util.Map;

public class CopyListRandomPointer {
	 public RandomListNode copyRandomList(RandomListNode head) {
	        if(head == null){return null;}
	        RandomListNode newhead = new RandomListNode(head.label);
	        
	        RandomListNode tmp = head.next;
	        
	        RandomListNode tmp1 = newhead;
	        Map<RandomListNode,RandomListNode> map = new HashMap<>();
	        map.put(head,newhead);
	        
	        while(tmp != null){
	            tmp1.next = new RandomListNode(tmp.label);
	            map.put(tmp,tmp1.next);
	            tmp = tmp.next;
	            tmp1 = tmp1.next;
	            
	        }
	        
	        RandomListNode node1 = newhead;
	        RandomListNode node2 = head;
	        
	        
	        while(node1 != null){
	            node1.random = map.get(node2);
	            node1 = node1.next;
	            node2 = node2.next;
	            
	        }
	        
	        return newhead;
	        
	    }
}

 class RandomListNode {
     int label;
     RandomListNode next, random;
    RandomListNode(int x) { this.label = x; }
 }
 class Main2{
	 public static void main(String[] args) {
		
	}
 }

