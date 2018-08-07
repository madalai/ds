package com.heap;

public class MaxHeap {

	private int arr[] = new int[7];
	int pos  = 0;
	public MaxHeap() {
		
	}
	
	public void insert(int num){
		arr[pos] = num;
		pos++;
		heapify(pos);
	}

	private void heapify(int pos) {
		while(pos < arr.length && arr[getParent(pos)] < arr[pos]){
			int temp = arr[pos];
			arr[pos]=arr[getParent(pos)];
			arr[getParent(pos)] = temp;
			pos = getParent(pos);
			
			
		}
		
		
	}
	
	private int getParent(int pos){
		if(pos%2 == 0){
			return pos/2 -1;
		}
		return pos/2;
	}
	private int getLeft(int pos){
		return 2*pos+1;
	}
	private int getRight(int pos){
		return 2*pos+2;
	}
	
	public static void main(String[] args) {
		MaxHeap obj = new MaxHeap();
		obj.insert(1);
		obj.insert(8);
		obj.insert(3);
		obj.insert(11);
		obj.insert(34);
		obj.insert(6);
		obj.insert(2);
		System.out.println(obj.arr);	
	}
	
}
