package com.ds.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class LongestPath {
	 public static void main(String[] args) throws Exception{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
	        int t = Integer.parseInt(reader.readLine());
	        for(int i = 0 ; i < t ;i++){
	            String s1[] = reader.readLine().split(" ");
	            int node = Integer.parseInt(s1[0]);
	            int e = Integer.parseInt(s1[1]);
	            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	            intialize(graph,node+1);
	            for(int j = 0 ; j < e; j++){
	                String s2[] = reader.readLine().split(" ");
	            int u = Integer.parseInt(s2[0]);
	            int v = Integer.parseInt(s2[1]);
	            graph.get(u).add(v);
	            graph.get(v).add(u);
	            
	            }
	            System.out.println(find(graph,node));
	        }
	    }
	    public static int find(ArrayList<ArrayList<Integer>> graph,int n){
	        int source = 1;
	        int last = BFS(graph,source);
	        int length = BFSLength(graph,last);
	        return length;
	    }
	    
	    public static int BFS(ArrayList<ArrayList<Integer>> graph,int source){
	        boolean vis[] = new boolean[graph.size()+1];
	        int last  = 0;
	        Arrays.fill(vis,Boolean.FALSE);
	        Queue<Integer> queue = new LinkedList<>();
	        queue.offer(source);
	        while(!queue.isEmpty()){
	            int i = queue.poll();
	            for(int tmp : graph.get(i)){
	                if(vis[tmp] == false){
	                    queue.offer(tmp);
	                }
	            }
	            vis[i] = true;
	            last = i;
	        }
	         return last;
	    }
	    public static int BFSLength(ArrayList<ArrayList<Integer>> graph,int source){
	        boolean vis[] = new boolean[graph.size()+1];
	        int dist[] = new int[graph.size()+1];
	        Arrays.fill(dist, -1);
	        dist[source] = 0;
	        int length  = 0;
	        Arrays.fill(vis,Boolean.FALSE);
	        Queue<Integer> queue = new LinkedList <>();
	        queue.offer(source);
	        while(!queue.isEmpty()){
	            int i = queue.poll();
	            for(int tmp : graph.get(i)){
	                if(vis[tmp] == false){
	                    queue.offer(tmp);
	                    dist[tmp] = dist[i]+1;
	                    if(length<dist[tmp]){
	                    	length = dist[tmp];
	                    }
	                }
	            }
	            vis[i] = true;
	            
	        }
	         return length;
	    }
	    private static void intialize(ArrayList<ArrayList<Integer>> graph,int node){
	        for(int i=0;i<node ;i++){
	            graph.add(new ArrayList<Integer>());
	        }
	    }
}
