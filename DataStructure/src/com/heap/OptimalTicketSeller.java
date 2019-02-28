package com.heap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * https://www.hackerrank.com/contests/smart-interviews-9c/challenges/si-optimal-ticket-seller
 * @author madalai
 *
 */
public class OptimalTicketSeller {  public static void main(String[] args) throws Exception{
    
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
      int t = Integer.parseInt(reader.readLine());
      for(int i=0 ; i < t ;i++){
          String s1[] = reader.readLine().split(" ");
          int n = Integer.parseInt(s1[0]);
          int k =  Integer.parseInt(s1[1]);
          PriorityQueue<Integer> queue = new PriorityQueue<>( Collections.reverseOrder());
          String tkts[] = reader.readLine().split(" ");
          for(int j = 0 ; j < n ; j++){
              queue.offer(Integer.parseInt(tkts[j]));
          }
          long ans = 0l;
          int m =k;
          while(m>0){
              int ele = queue.poll();
              int sec = queue.peek();
              if(m- (ele-sec+1) < 0){
                  ans = ans + ele;
                  queue.offer(ele-1);
                  m--;
                  continue;
              }else{
              ans = ans+(((ele*(ele+1))/2)-((sec*(sec+1))/2)+sec);
              }
              m = m- (ele-sec+1);
              queue.offer(sec-1);
          }
         writer.append(""+ans);
          writer.newLine();
          
      }
      writer.flush();

}
}
