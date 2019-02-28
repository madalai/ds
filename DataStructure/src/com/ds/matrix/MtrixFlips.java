package com.ds.matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MtrixFlips {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            String s1[] = reader.readLine().split(" ");
            int m = Integer.parseInt(s1[0]);
            int n = Integer.parseInt(s1[1]);
            int mat[][] = new int[m][n];

            for (int p = 0; p < m; p++) {
                String s2[] = reader.readLine().split("");
                for (int q = 0; q < n; q++) {
                    mat[p][q] = Integer.parseInt(s2[q]);
                }
            }
            System.out.println(helper(mat, m, n));
        }
    }

    public static int helper(int arr[][], int m, int n) {
        int count =0;
        boolean zero = true;
        for(int i= m-1;i>=0;i--){
            for(int j = n-1;j>=0;j--){
                if(zero){
                   if(count%2 == 0) {
                       if(arr[i][j] == 0){
                           count++;
                           zero = false;
                       }
                   }else{
                       if(arr[i][j] == 1){
                           count++;
                           zero = false;
                       }
                   }
                }else{
                    if(count%2 == 0) {
                       if(arr[i][j] == 0){
                           count++;
                           zero = true;
                       }
                   }else{
                       if(arr[i][j] == 1){
                           count++;
                           zero = true;
                       }
                   }
                }
            }
        }
        return count;
       
    }
}
