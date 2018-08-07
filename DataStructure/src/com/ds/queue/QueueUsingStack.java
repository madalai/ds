package com.ds.queue;

import java.util.Stack;

public class QueueUsingStack {    
	Stack<Integer> input,output;
public QueueUsingStack() {
    input  = new Stack<>();
    output  = new Stack<>();
}

/** Push element x to the back of queue. */
public void push(int x) {
    input.push(x);
    while(!input.isEmpty()){
        output.push(input.pop());
    }
    while(!output.isEmpty()){
        input.push(output.pop());
    }
    
}

/** Removes the element from in front of queue and returns that element. */
public int pop() {
    while(!input.isEmpty()){
        output.push(input.pop());
    }
    int val = output.pop();
    
    while(!output.isEmpty()){
        input.push(output.pop());
    }
    
    return val;
}

/** Get the front element. */
public int peek() {
    
    return input.peek();
}

/** Returns whether the queue is empty. */
public boolean empty() {
    return input.isEmpty();
}}
