package com.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TowersOfHanoi {
    public static void main(String[] args) throws Exception{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
           int t = Integer.parseInt(reader.readLine());
           for(int i=0;i < t ;i++){
               int n = Integer.parseInt(reader.readLine());
               List<String> list = new ArrayList<>();
                helper('A','C','B',n,list);
               System.out.println(list.size());
               for(String s: list){
                   System.out.println(s);
               }
               
           }
       
   }
   public static void helper(char src,char dest,char tmp,int n,List<String> list){
       if(n == 0){
           return;
       }
       helper(src,tmp,dest,n-1,list);
       String s = "Move "+n +" from "+src +" to "+dest;
       list.add(s);
       helper(tmp,dest,src,n-1,list);
   }
}
