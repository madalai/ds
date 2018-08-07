package com.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class WidthOfBinaryTree {
	public int widthOfBinaryTree(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue =  new LinkedList<>();
        if(root == null){
            return 0;
        }
        int height = height(root);
        queue.offer(root);
        while(!queue.isEmpty() && list.size() < height){
            List<Integer> iList = new ArrayList<>();
            int size = queue.size();
            for(int i = 0 ; i < size ;i++){
                if(queue.peek()!= null){
                    
                        queue.offer(queue.peek().left);
                        queue.offer(queue.peek().right);  
                    
                }
                else{
                    queue.offer(null);
                    queue.offer(null);
                }
                TreeNode node = queue.poll();
                
                iList.add(node == null ? null :node.val);
            }
            list.add(iList);
        }
        
        return findMax(list);
        
    }
    
    private int findMax(List<List<Integer>> list) {
		int max = 0;
		
		for(List<Integer> temp : list){
			int size = temp.size();
			for(int i = temp.size()-1 ; i >= 0;i--){
				if(temp.get(i) == null){
					size--;
				}
				else{
					break;
				}
			}
			if(size > max){
				max = size;
			}
		}
		return max;
	}

	public int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        return left >right ? left+1 :right+1;
    }
	
	
	public static void main(String[] args) {
		TreeNode root  = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.left = new TreeNode(5);
		root.left.right = new TreeNode(3);
		
		WidthOfBinaryTree obj = new WidthOfBinaryTree();
		int a = obj.widthOfBinaryTree(root);
		System.out.println(a);
		
	}
}
