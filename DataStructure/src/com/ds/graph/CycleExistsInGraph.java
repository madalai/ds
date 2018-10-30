package com.ds.graph;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class CycleExistsInGraph {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(reader.readLine());
		for (int i = 0; i < t; i++) {
			String s1[] = reader.readLine().split(" ");
			int node = Integer.parseInt(s1[0]);
			int e = Integer.parseInt(s1[1]);
			ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
			intialize(graph, node + 1);
			for (int j = 0; j < e; j++) {
				String s2[] = reader.readLine().split(" ");
				int u = Integer.parseInt(s2[0]);
				int v = Integer.parseInt(s2[1]);
				graph.get(u).add(v);
				graph.get(v).add(u);

			}
			boolean vis[] = new boolean[node+1];
			System.out.println(checkCycleExists(graph,vis));
		}

	}

	private static boolean checkCycleExists(ArrayList<ArrayList<Integer>> graph, boolean[] vis) {
		if(vis[])
	}

	private static char[] checkCycleExists(ArrayList<ArrayList<Integer>> graph) {
		// TODO Auto-generated method stub
		return null;
	}

	private static void intialize(ArrayList<ArrayList<Integer>> graph, int node) {
		for (int i = 0; i < node; i++) {
			graph.add(new ArrayList<Integer>());
		}
	}
}
