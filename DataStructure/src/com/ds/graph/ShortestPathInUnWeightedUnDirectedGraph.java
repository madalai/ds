package com.ds.graph;
/**
 * 2
5 3
1 3
2 4
3 2
4
1 5
3 4
4 5
1 4
10 9
3 4
5 1
2 5
4 6
2 3
6 3
1 4
8 9
8 10
5
2 4
8 4
9 10
10 5
9 7
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUnWeightedUnDirectedGraph {
	public static int shortestPath(ArrayList<ArrayList<Integer>> graph,int s,int d){
		boolean vis[] = new boolean[graph.size()+1];
		Queue<GraphNode> queue = new LinkedList<>();
		queue.offer(new GraphNode(s, 0));
		while(!queue.isEmpty()){
			GraphNode node = queue.poll();
			if(vis[node.val] != true){
				for(int i : graph.get(node.val)){
					queue.offer(new GraphNode(i,node.dist+1));
				}
				vis[node.val] = true;
			}
			if(node.val == d){
				return node.dist;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for(int i = 1 ; i <= t ;i++){
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
                System.out.println(shortestPath(list,n1,n2));
            }
        }
    }
	

}
class GraphNode{
	int val;
	int dist;
	public GraphNode(int val,int dist){
		this.val = val;
		this.dist = dist;
	}
	
	
	 
}