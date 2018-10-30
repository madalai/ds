package com.ds.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	  public static void main(String[] args) throws Exception{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	         //BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	        int t = Integer.parseInt(reader.readLine());
	        for(int i = 0 ; i <= t ;i++){
	            String s1[] = reader.readLine().split(" ");
	            int nodes = Integer.parseInt(s1[0]);
	            int edges = Integer.parseInt(s1[1]);
	            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
	            for(int j = 0 ; j <= nodes ;j++){
	                list.add(new ArrayList<Integer>());
	            }
	            for(int j = 0 ; j < edges ;j++){
	                String s2[] = reader.readLine().split(" ");
	                int n1 = Integer.parseInt(s2[0]);
	                int n2 = Integer.parseInt(s2[1]); 
	                list.get(n1).add(n2);
	                list.get(n2).add(n1);
	            }
	            System.out.println("Test Case #"+i+":");
	            int q = Integer.parseInt(reader.readLine());
	            for(int j = 0 ; j < q ;j++){
	            String s3[] = reader.readLine().split(" ");
	            int n1 = Integer.parseInt(s3[0]);
	            int n2 = Integer.parseInt(s3[1]);
	                System.out.println(isPathExist(list,n1,n2)?"Yes":"No");
	            }
	        }
	    }
	    
	    public static boolean isPathExist(ArrayList<ArrayList<Integer>> list,int n1,int n2){
	        boolean vis[] = new boolean[list.size()+1];
	        Queue<Integer> queue = new LinkedList<>();
	        queue.offer(n1);
	        vis[n1] = true;
	        while(!queue.isEmpty()){
	            int ele = queue.poll();
	            ArrayList<Integer> tmpList = list.get(ele);
	            for(Integer num : tmpList){
	                if(!vis[num]){
	                    queue.offer(num);
	                    vis[num] = true;
	                }
	            }
	        }
	        
	        return vis[n2];
	    }
}
