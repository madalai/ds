package com.ds.backtrack;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * https://www.hackerrank.com/contests/smart-interviews-9c/challenges/si-partition-strings
 * @author madalai
 *
 */
public class PartitioningString {

	static int ans = 0;
    public static void main(String[] args) throws Exception{
       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for(int i=0 ; i < t;i++){
            String s[] = reader.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            String str = reader.readLine();
            ans = 0;
            backtrack(str,"",k);
            System.out.println(ans);
        }
    }
    
    public static void backtrack(String given,String choosen,int k){
        if(given.isEmpty()){
            if(isValid(choosen,k)){
                ans++;
            }
            return;
        }
        
        for(int i=0;i<given.length();i++){
            String tmpCh = choosen;
            String tmpGiv = given;
            if(!choosen.isEmpty())
            choosen = choosen+",";
            choosen = choosen +given.charAt(i);
            if(i==0){
            	given = given.substring(i+1,given.length());
            }else
            given = given.substring(0,i)+given.substring(i+1,given.length());
            backtrack(given,choosen,k);
            //choosen = tmpCh;
          //  given = tmpGiv;
        }
    }
    public static boolean isValid(String choosen,int k){
        String str[] = choosen.split(",");
        for(String s : str){
            int n = Integer.parseInt(s);
            if(n >= k){
                return false;
            }
        }
        return true;
    }
}
