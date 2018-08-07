package com.ds.randomalgos;

import com.ds.linkedlist.LinkedList;
import com.ds.linkedlist.Node;

public class KillAndPass {

	public static void main(String[] args) {

		int n = getLastmanStanding(100);
		System.out.println(n);
	}

	public static int getLastmanStanding(int n) {
		LinkedList ls = new LinkedList();
		ls.add(1);
		Node curr = ls.getHead();

		for (int i = 2; i <= n; i++) {
			ls.add(i);
			curr = curr.next;
		}
		curr.next = ls.getHead();

		Node last = ls.getHead();
		while (last.next != last) {
			Node temp = last.next.next;
			;
			last.next = temp;
			last = temp;
		}

		return last.obj;
	}

}
