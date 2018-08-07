package com.ds.queue;

public class Main {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		while(true){
			Integer i = queue.deueue();
			if(i == null){
				break;
			}
			System.out.println(i);
			
		}
	}
}
