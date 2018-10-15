package com.ds.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class VerticalTraverse {
	public static void main(String[] args) {
		TreeNode root  = new TreeNode(22);
		root.right =  new TreeNode(55);
		root.right.left =  new TreeNode(77);
		root.right.left.right =  new TreeNode(99);
		VerticalTraverse obj = new VerticalTraverse();
		System.out.println(obj.verticalOrderTraversal(root));
	}
	 Map<Integer,ArrayList<DepthNode>> map = new TreeMap<>();
	    public ArrayList<ArrayList<Integer>> verticalOrderTraversal(TreeNode root) {
	    traverse(root,0,0);
	    Comparator<DepthNode> comp = new Comparator<DepthNode>(){
	        public int compare(DepthNode node1,DepthNode node2){
	            return node2.depth.compareTo(node1.depth);
	        }

			
	    };
	    
	    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	    for(Map.Entry<Integer,ArrayList<DepthNode>> entry : map.entrySet()){
	        Collections.sort(entry.getValue(),comp);
	        ArrayList<Integer> tmpList = new ArrayList<>();
	        for(DepthNode d : entry.getValue()){
	            tmpList.add(d.node.val);
	        }
	        list.add(tmpList);
	    }
	    
	    return list;
	        
	    }
	    
	    public void traverse(TreeNode root,int vertical,int depth){
	        if(root == null){
	            return;
	        }
	        traverse(root.left,vertical-1,depth-1);
	        DepthNode tmp = new DepthNode(root,depth);
	        if(!map.containsKey(vertical)){
	            map.put(vertical,new ArrayList<DepthNode>());
	        }
	        map.get(vertical).add(tmp);
	        traverse(root.right,vertical+1,depth-1);
	    }
	}
	class DepthNode{
	    TreeNode node;
	    Integer depth;
	    public DepthNode(TreeNode node,Integer depth){
	        this.node = node;
	        this.depth = depth;
	    }
}
