package com.ds.tree;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreeFromPreAndInOrdr {
	 int index = 0;
	    public TreeNode buildTree(int[] preorder, int[] inorder) {
	        if(preorder == null || inorder == null){
	            return null;
	        }
	         Map<Integer,Integer> map = new HashMap<>();
	        for(int i = 0 ; i < inorder.length;i++){
	            map.put(inorder[i],i);
	           
	        }
	        
	        return helper(preorder,inorder,0,inorder.length-1,map);
	    }
	    
	    public TreeNode helper(int[] preorder, int[] inorder,int start,int end,Map<Integer,Integer> map){
	        if(start > end){
	            return null;
	        }
	        int data = preorder[index++];
	        
	        TreeNode root = new TreeNode(data);
	        if(start == end){
	            return root;
	        }
	        int idx = map.get(data);
	        root.left = helper(preorder,inorder,start,idx-1,map);
	        root.right = helper(preorder,inorder,idx+1,end,map);
	        
	        return root;

	    }
	    
	    public static void main(String[] args) {
			ConstructBinaryTreeFromPreAndInOrdr obj = new ConstructBinaryTreeFromPreAndInOrdr();
			int pre[] = {3,9,20,15,7};
			int post[] ={9,3,15,20,7};
			
			TreeNode root = obj.buildTree(pre, post);
			System.out.println(root);
					
	    }

}
