package com.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewOfTree {

	public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root == null){
            return list;
        }
       Queue<TreeNode> queue = new LinkedList<>();
        
        queue.offer(root);
        
        while(!queue.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int n = queue.size();
            
            for(int i = 0 ; i < n ; i++){
                
                if(queue.peek().left != null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                
                level.add(0,queue.poll().val);
            }
            list.add(level.get(0));
        }
        return list;
    }
	
	public static void main(String[] args) {
		RightSideViewOfTree obj = new RightSideViewOfTree();
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right = new TreeNode(5);
		//root.right.right = new TreeNode(6);
		
		for(int a:obj.rightSideView(root)){
			System.out.println(a);
		}
		
		//System.out.println(root);
	}
}
