package com.ds.stack;
import java.util.Stack;
public class ExpressionEval {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0 ; i < tokens.length;i++){
            if(isOperator(tokens[i])){
                int a = stack.pop();
                int b = stack.pop();
                stack.push(eval(a,b,tokens[i]));
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
    public boolean isOperator(String s){
        return "+".equals(s) || "-".equals(s) || "*".equals(s) || "/".equals(s);
    }
    public int eval(int a,int b,String oper){
        if("+".equals(oper)){
            return a+b;
        }
        if("-".equals(oper)){
            return a-b;
        }
        if("*".equals(oper)){
            return a*b;
        }
        if("/".equals(oper)){
            return a/b;
        }
        return 0;
    }
}
