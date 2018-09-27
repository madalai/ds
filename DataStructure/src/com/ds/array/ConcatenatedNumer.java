package com.ds.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ConcatenatedNumer {
	static int h = 0;
	static long max = Long.MIN_VALUE;
    public static void main(String[] args) {
       
    	int arr[]={0,0};
         
             System.out.println(largestNumber(arr));
         
     }
    public static String largestNumber(int[] nums) {
        List<Integer> list = new ArrayList<>();
         
         for(int i = 0 ; i < nums.length;i++){
             list.add(nums[i]);
         }
         Comparator<Integer> cmp = new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {
                String s1 = a+"";
                String s2 = b+"";
           
                
                return (s2+s1).compareTo(s1+s2);
		}
         };
			
			
         
         Collections.sort(list,cmp);
         
         StringBuffer number = new StringBuffer();
         for(int n : list){
             number.append(n);
         }
         
         String k = number.toString();
         String k1 = k;
         while(k1.length() > 0){
        	 
        	 if(k.charAt(0) == '0'){
        		 k1 = k1.substring(1, k1.length());
        	 }
        	 else{
        		 break;
        	 }
         }
         return k1.length() > 0 ?k1:"0";
         
         
     }
     public static void helper(int given[],StringBuffer choosen,int givenLength , int choosenLength){
         if(givenLength == 0){
             long tmp = Long.parseLong(choosen.toString());
             if(tmp > max){
                 max = tmp;
             }
             return ;
         }
         
         for(int i = 0 ; i < given.length ; i++){
             if(given[i] == -1){
                 continue;
             }
             String s = ""+given[i];
             choosen.append(""+given[i]);
             int tmp = given[i];
             given[i] = -1;
             helper(given,choosen,givenLength-1,choosenLength+1);
             
             given[i] = tmp;
             choosen.delete(choosen.length()-s.length(),choosen.length());
             
             
             
         }
        
         
     }
}
