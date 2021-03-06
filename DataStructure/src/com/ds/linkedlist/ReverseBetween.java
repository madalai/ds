package com.ds.linkedlist;

public class ReverseBetween {
	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		head.next.next.next.next=new ListNode(5);
		ListNode head1 =new ReverseBetween().reverseBetween(head, 2, 4);
		System.out.println(head1);
		
	}
	   public ListNode reverseBetween(ListNode head, int m, int n) {
		      
	        ListNode mNode = null;
	        ListNode mPrev = null;
	   
	        int count = 1;
	        ListNode dummy = new ListNode(1);
	        dummy.next = head;
	        ListNode curr = head;
	        ListNode prev = dummy;
	        ListNode tmp = null;
	        while(count <= n){
	            if(count < m){
	                count++;
	                prev= curr;
	                curr = curr.next;
	                continue;
	            }
	            if(count == m){
	                mPrev = prev;
	                mNode = curr;
	                count++;
	                prev= curr;
	                curr = curr.next;
	                continue;
	            }
	            
	            tmp = curr.next;
	            curr.next = prev;
	            prev = curr;
	            curr = tmp;
	            count++;
	        
	            
	        }
	        mPrev.next = prev;
	        mNode.next = tmp;
	        
	        return dummy.next;
	        
	        
	    }
   /* public ListNode reverseBetween(ListNode head, int m, int n) {
        
        if(head == null || head.next == null){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;
        int x = m;
        int k = n-m;
        while(m > 1){
            prev = curr;
            curr = curr.next;
            m--;
        }
        
        ListNode prev1 = curr;
        ListNode tmp = curr.next;
        ListNode tmp1 = null;
        while(tmp != null && k > 1){
        	tmp1 = tmp.next;
            tmp.next = prev1;
            prev1 = tmp;
            tmp = tmp1;
            k--;
        }
        if(prev == null){
            head = tmp;
        }
        else{
        prev.next = tmp;
        }
        curr.next =tmp!=null?tmp.next:null;
       
        return head;
        
    }*/
}

