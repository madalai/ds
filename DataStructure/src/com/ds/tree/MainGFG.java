package com.ds.tree;

public class MainGFG {
	public static void main(String[] args) {
		MainGFG obj = new MainGFG();
		Node1 root = new Node1(5);
		root.left = new Node1(6);
		//root.right = new Node1(1);
		System.out.println(obj.maxDiff(root));
	}
	 int ans = -9999;
	    int maxDiff(Node1 root)
	    {
	        return helper(root,-9999);
	    }
	    public int helper(Node1 root,int max){
	        if(root == null){
	            return -9999;
	        }
	       
	       // if(max!=Integer.MIN_VALUE)
	        int diff = max-root.data;
	        max = Math.max(max,root.data);
	        ans = Math.max(ans,diff);
	        return Math.max(ans,Math.max(helper(root.left,max),helper(root.right,max)));
	        
	    }
	    
	   
}
class Node1{
	int data;
	Node1 left;Node1 right;
	public Node1(int data){
		this.data = data;
	}
}