package com.ds.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javafx.util.Pair;

public class RottenOranges {
	static int dx[] = { -1,0,1,0 };
	static int dy[] = { 0 ,1,0,-1};

	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(reader.readLine());
		for (int p = 0; p < t; p++) {
			int n = Integer.parseInt(reader.readLine());
			int mat[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				String s[] = reader.readLine().split("");
				for (int j = 0; j < n; j++) {
					mat[i][j] = Integer.parseInt(s[j]);
				}
			}
			System.out.println(findDays(mat, n));
		}
	}

	public static int findDays(int mat[][], int n) {

		int count = 0;
		List<Pair<Integer, Integer>> list = new ArrayList<>();
		while (true) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (mat[i][j] == 2) {
						list.add(new Pair<Integer, Integer>(i, j));
					}

				}
				

			}
			for(Pair<Integer, Integer> p:list){
				for (int m = 0; m < 4; m++) {
					DFS(mat, p.getKey() + dx[m], p.getValue() + dy[m], n);
					
				}
				mat[p.getKey()][p.getValue()] = 3;
				
			}
			if(list.isEmpty() ){
				break;
			}
			else if(isAllRotten(mat,n)){
				count++;
				break;
			}
			else{
				list.clear();
				count++;
			}
		
		}

		if (!isAllRotten(mat, n)) {
			return -1;
		}
		return count;
	}

	private static boolean hasRotten(int[][] mat, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 2) {
					return true;
				}
			}
		}
		return false;
	}

	public static void DFS(int mat[][], int i, int j, int n) {
		if (i < 0 || i >= n || j < 0 || j >= n) {
			return;
		}
		if (mat[i][j] == 1) {
			mat[i][j] = 2;
			return;
		}
		

	}

	public static boolean isAllRotten(int mat[][], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (mat[i][j] == 1) {
					return false;
				}
			}
		}
		return true;
	}
}
