package com.ds.stack;
import java.util.Stack;
public class MinStack {
	  /** initialize your data structure here. */
    Stack<Integer> stack;
    Stack<Integer> min ;
    Integer minVal = Integer.MAX_VALUE;
    public MinStack() {
        stack = new Stack();
        min = new Stack();
    }
    
    public void push(int x) {
        stack.push(x);
        if(min.isEmpty()){
            if(x < minVal){
            min.push(x);
        }
        }
        else{
           if(x < min.peek()){
               min.push(x);
           }
        }
        
        
        
    }
    
    public void pop() {
        int n = stack.pop();
        if(min.peek() == n){
            min.pop();
        }
    }
    
    public int top() {
        return stack.pop();
        
    }
    
    public int getMin() {
        return min.peek();
    }
}
