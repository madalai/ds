package com.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PopulateNextRightPointers {
	public static void main(String[] args) {
		TreeLinkNode root  = new TreeLinkNode(22);
		root.left =  new TreeLinkNode(55);
		root.right =  new TreeLinkNode(33);
		root.left.left =  new TreeLinkNode(773);
		root.right.left =  new TreeLinkNode(77);
		root.right.left.right =  new TreeLinkNode(99);
		PopulateNextRightPointers obj = new PopulateNextRightPointers();
		obj.connect(root);
		System.out.println(root.val);
	}
	
    public void connect(TreeLinkNode root) {
        if(root == null){return ;}
      levelOrder(root) ; 
        
        
    }
    
    public void levelOrder(TreeLinkNode root){
        Queue<TreeLinkNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int n = queue.size();
           
            TreeLinkNode prev = null;
            for(int i =0 ; i <n ;i++){
                TreeLinkNode node = queue.poll();
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
               
                if(prev!=null){
                    prev.next = node;

                }
                prev = node;
            }
          
        }
    }

}
