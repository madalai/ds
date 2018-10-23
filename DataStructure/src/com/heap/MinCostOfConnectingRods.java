package com.heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class MinCostOfConnectingRods {

    public static void main(String[] args) throws Exception{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(reader.readLine());
            for(int i=0;i < t ;i++){
                int n = Integer.parseInt(reader.readLine());
               
                String s = reader.readLine();
                String str[] = s.split(" ");
               
                PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
                
                for(String s1 : str){
                    int num = Integer.parseInt(s1);
                    minHeap.offer(num);
                }
                int cost = 0;
                while(minHeap.size()!=1){
                    int n1 = minHeap.poll();
                    int n2 = minHeap.poll();
                    int res = n1 + n2;
                    cost = res;
                    minHeap.offer(res);
                }
                System.out.println(cost);
                
            }
    }
}