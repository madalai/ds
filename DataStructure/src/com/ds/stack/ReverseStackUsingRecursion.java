package com.ds.stack;
import java.util.Stack;
public class ReverseStackUsingRecursion {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1); stack.push(2); stack.push(3); stack.push(14);
		System.out.println(stack);
		reverse(stack);
		System.out.println(stack);
	}

	public static void reverse(Stack<Integer> stack){
		if(stack.isEmpty()){
			return;
		}
		else{
			int ele = stack.pop();
			reverse(stack);
			insertAtButtom(ele,stack);
			//stack.push(ele);
		}
	}

	private static void insertAtButtom(int ele,Stack<Integer> stack) {
		if(stack.isEmpty()){
			stack.push(ele);
		}else{
			int tmp = stack.pop();
			insertAtButtom(ele, stack);
			stack.push(tmp);
		}
		
	}
}
