package com.heap;

public class MinHeap1 {
	private int arr[];
	int pos;
	public MinHeap1(int size){
		arr = new int[size];
		pos = 0;
	}
	public void add(int n){
		arr[pos] = n;
		pos++;
		heapify(pos);
		
	}
	private void heapify(int pos) {
		// TODO Auto-generated method stub
		
	}
	
	public int getLeft(int pos){
		return 2*pos + 1;
	}
	public int getRight(int pos){
		return 2*pos+2;
	}
	public int getParent(int pos){
		if(pos%2 == 0){
			return pos/2 -1;
		}
		return pos/2;
	}

}
