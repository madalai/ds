package com.heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AnyTimeMedian {
	 public static void main(String[] args) throws Exception{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(reader.readLine());
	        for(int i=0;i < t ;i++){
	            int n = Integer.parseInt(reader.readLine());
	           
	            String s = reader.readLine();
	            String str[] = s.split(" ");
	           
	            PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	            PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Comparator.reverseOrder());
	            for(String s1 : str){
	                int num = Integer.parseInt(s1);
	                insert(num,minHeap,maxHeap);
	                System.out.print(maxHeap.peek());
	                System.out.print(" ");
	            }
	            System.out.println();
	            
	        }
	    }
	    public static void insert(int num,PriorityQueue<Integer> minHeap,PriorityQueue<Integer> maxHeap){
	        if(minHeap.size() == maxHeap.size()){
	            if(maxHeap.size()==0){
	                maxHeap.offer(num);
	            }else if(maxHeap.peek() > num){
	                maxHeap.offer(num);
	            }else if(minHeap.peek()<num){
	                minHeap.offer(num);
	                maxHeap.offer(minHeap.poll());
	            }else{
	            	maxHeap.offer(num);
	            }
	        }else{
	            if(num < maxHeap.peek()){
	                maxHeap.offer(num);
	                if(maxHeap.size()-minHeap.size() > 1){
	                    minHeap.offer(maxHeap.poll());
	                }
	            }else{
	                minHeap.offer(num);
	                if(minHeap.size()-maxHeap.size() > 1){
	                    maxHeap.offer(minHeap.poll());
	                }
	            }
	        }
	    }

}
