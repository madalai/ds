package com.ds.linkedlist;

public class ReverseLinkedListGroupOfK {

	
	
	public ListNode reverse(ListNode head,int k){
		
		ListNode step = head;
		for(int m =1;m<=k;m++){
			if(step == null){
				break;
			}
			else{
				step = step.next;
			}
		}
		
		ListNode curr = head;
		ListNode tp = head;
		ListNode prev = null;
		int count = 0;
		while(count<k){
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
			
			count++;
		}
		head = prev;
		
		if(curr!=null){
			tp.next = reverse(curr, k);
		}
		
		return  head;
	}
	
	public static void main(String[] args) {
		ListNode node = new ListNode(1);
		node.next = new ListNode(2);
		node.next.next = new ListNode(3);
		node.next.next.next = new ListNode(4);
		node.next.next.next.next = new ListNode(5);
		node.next.next.next.next.next = new ListNode(6);
		node.next.next.next.next.next.next = new ListNode(7);
		node.next.next.next.next.next.next.next = new ListNode(8);
		node.next.next.next.next.next.next.next.next = new ListNode(9);
		node.next.next.next.next.next.next.next.next.next = new ListNode(10);
		
		ReverseLinkedListGroupOfK obj = new ReverseLinkedListGroupOfK();
		ListNode n = obj.reverse(node, 3);
		while(n != null){
			System.out.println(n.val +",");
			n = n.next;
		}
	}

}

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}