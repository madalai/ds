package com.thread;

public class SubArraySun {
public static void main(String[] args) throws InterruptedException {
	int arr[] = new int[100];
	for(int i = 1;i<101;i++){
		arr[i-1] = i;
	}
	int ans[] = new int[10];
	int start = 0;
	int end = 9;
	int ansIdx = 0;
	for(int i = 0 ; i < 10 ;i++){
		Thread t = new Thread(new SumRunable(start, end, arr, ans, ansIdx));
		t.start();
		ansIdx++;
		start+=10;
		end+=10;
		
	}
	Thread.sleep(1000);
	for(int i=0;i<ans.length;i++){
		System.out.println("Sum in part "+i+":"+ans[i]);
	}
	
}
}
class SumRunable implements Runnable{
private int i;
private int j;
private int arr[];
private int ans[];
private int ansIdx;

	public SumRunable(int i,int j,int arr[],int ans[],int ansIdx){
		this.i = i;
		this.j = j;
		this.arr = arr;
		this.ans = ans;
		this.ansIdx = ansIdx;
	}
	@Override
	public void run() {
		int sum = 0;
		for(;i<=j;i++){
			sum += arr[i];
		}
		ans[ansIdx] = sum;
		
	}
	
}
