package com.ds.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Forest {
	   public static void main(String[] args) throws Exception{
	        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
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
	            System.out.println(isForest(graph,node,e)?"Yes":"No");
	        }
	    }
	    
	    public static boolean isForest(ArrayList<ArrayList<Integer>> graph,int nodes,int edges){
	        int components = find(graph,nodes);
	        return nodes == (components+edges) ;
	    }
	    public static int find(ArrayList<ArrayList<Integer>> graph,int n){
	        int count = 0;
	        boolean vis[] = new boolean[n+1];
	        Arrays.fill(vis,Boolean.FALSE);
	        for(int i = 1 ;i<=n;i++){
	            if(vis[i] == false){
	                count++;
	                DFS(graph,i,vis);
	            }
	        }
	        return count;
	    }
	    
	    public static void DFS(ArrayList<ArrayList<Integer>> graph,int s,boolean vis[]){
	        if(vis[s]==true){return;}
	        vis[s]=true;
	        for(Integer num:graph.get(s)){
	            DFS(graph,num,vis);
	        }
	    }
	    private static void intialize(ArrayList<ArrayList<Integer>> graph,int node){
	        for(int i=0;i<node ;i++){
	            graph.add(new ArrayList<Integer>());
	        }
	    }
}
