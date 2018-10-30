package com.ds.graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NumberOfIslands {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       
        int t = Integer.parseInt(reader.readLine());
        for(int i = 0 ; i < t ;i++){
            String s1[] = reader.readLine().split(" ");
            int m = Integer.parseInt(s1[0]);
            int n = Integer.parseInt(s1[1]);
            int mat[][] = new int[m][n];
            for(int p = 0 ; p < m ; p++){
                String s2[] = reader.readLine().split("");
                for(int q = 0 ; q<n;q++){
                    mat[p][q] = Integer.parseInt(s2[q]);
                }
            }
            System.out.println(find(mat,m,n));
        }
    }
    public static int find(int mat[][],int m,int n){
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1){
                    count++;
                    DFS(mat,m,n,i,j);
                }
            }
        }
        return count;
    }
    public static void DFS(int mat[][],int m,int n,int i,int j){
        if(i<0 || i>=m || j<0 ||j>=n || mat[i][j] == 0){
            return;
        }
        mat[i][j] = 0;
        int dx[]={-1,-1,-1,0,1,1,1,0};
        int dy[]={-1,0,1,1,1,0,-1,-1};
        for(int k=0;k<8;k++){
            DFS(mat,m,n,i+dx[k],j+dy[k]);
        }
    }
}