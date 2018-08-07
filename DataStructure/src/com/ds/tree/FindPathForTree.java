package com.ds.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindPathForTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		 List<TreeNode> list1 = new ArrayList<>();
		 List<TreeNode> list2 = new ArrayList<>();
	        findPath(root,p,list1);
	        findPath(root,q,list2);
	        Collections.reverse(list1);
	        Collections.reverse(list2);
	        
	        for(int i = 1 ; i < list1.size() ; i++){
	        	if(list1.get(i) != list2.get(i)){
	        		return list1.get(i-1);
	        	}
	        }
	        
	        return null;
	      
	    }
	    
	    public boolean findPath(TreeNode root, TreeNode node,List<TreeNode> list){
	    	
	    	if(root == null){
	    		return false;
	    	}
	        
	       
	        if(root == node || findPath(root.left,node,list) || findPath(root.right,node,list)){
	            list.add(root);
	            return true;
	        }
	        else{
	         return false;
	        
	        }
	       
	        
	    }
	    
	    public static void main(String[] args) {
	    	
			TreeNode root = new TreeNode(1);
			root.left = new TreeNode(2);
			root.left.left = new TreeNode(3);
			root.left.right = new TreeNode(4);
			root.right = new TreeNode(5);
			root.right.right = new TreeNode(6);
	    	FindPathForTree obj = new FindPathForTree();
	    	//obj.findPath(root, 4);
		}
}


