package com.thread;

public class Test {

	public static void main(String[] args) {
		MyThread obj = new MyThread("one");
		obj.start();
		
		MyThread obj1 = new MyThread("two");
		obj1.start();
		
		MyThread obj2 = new MyThread("Stop");
		obj2.start();
	}
	
	
}
class MyThread extends Thread{
	private String name;
	public MyThread(String name){
		this.name = name;
	}
	public void run(){
		
		for(int i = 0 ; i<2 ;i++){
			try{
				sleep(1000);
			}
			catch(InterruptedException e){
				
			}
			yield();
			System.out.println(name);
		}
	}
}
