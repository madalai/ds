package com.ds.randomalgos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class MergeIntervals {
    public List<Interval1> merge(List<Interval1> Interval1s) {
    	
    	Collections.sort(Interval1s,new Comparator<Interval1>() {

			@Override
			public int compare(Interval1 o1, Interval1 o2) {
				
				return o1.start - o2.start;
			}
		});
        Stack<Integer> first = new Stack<>();
        Stack<Integer> last = new Stack<>();
      
        for(Interval1 Interval1: Interval1s){
            if(first.isEmpty()){
                first.push(Interval1.start);
                last.push(Interval1.end);
            }
            else{
                if(Interval1.start <= last.peek() && Interval1.start >= first.peek()){
                    int f = Math.min(first.peek(),Interval1.start);
                    int l = Math.max(last.peek(),Interval1.end);
                    
                    first.pop();
                    last.pop();
                    
                    first.push(f);
                    last.push(l);
                }
                
                else{
                    first.push(Interval1.start);
                    last.push(Interval1.end);
                }
            }
            
        }
        List<Interval1> list = new ArrayList<>();
        while(!first.isEmpty()  && !last.isEmpty()){
            Interval1 in = new Interval1();
            in.start=first.pop();
            in.end = last.pop();
            list.add(in);
        }
        
        return list;
    }
}

class Interval1 {
	      int start;
	      int end;
	      Interval1() { start = 0; end = 0; }
	      Interval1(int s, int e) { start = s; end = e; }
	  }
