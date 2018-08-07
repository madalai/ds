package com.ds.randomalgos;

import java.util.ArrayList;
import java.util.List;

//Definition for a binary tree node.
   class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
class Solution1 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<String>();
        if(root == null){
        	return list;
        }
        StringBuilder s = new StringBuilder();
        s.append(root.val);
        path(root,list,s);
        
        return list;
        
    }
    
    public void path(TreeNode root,List<String> list,StringBuilder s){
        if(root.left == null && root.right == null){
            list.add(s.toString());
            return;
        }
        if(root.left != null){
            StringBuilder sl = new StringBuilder(s);
            sl.append("->");
            sl.append(root.left.val);
            path(root.left,list,sl);
            
        }
        if(root.right != null){
            StringBuilder sr = new StringBuilder(s);
            sr.append("->");
            sr.append(root.right.val);
            path(root.right,list,sr);
        }
        
        
        
    }
    
    public static void main(String[] args) {
		TreeNode node = new TreeNode(1);
		node.left = new TreeNode(2);
		node.right = new TreeNode(3);
		node.left.right = new TreeNode(5);
		Solution1 obj = new Solution1();
		List<String> paths = obj.binaryTreePaths(node);
		System.out.println(paths);
	}
}