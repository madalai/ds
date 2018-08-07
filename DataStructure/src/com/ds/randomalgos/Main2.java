package com.ds.randomalgos;

import java.util.ArrayList;
import java.util.List;

public class Main2 {


		public static void main(String[] args) {
			String s = new Main2().getPermutation(3, 2);
			System.out.println(s);
		}
	public String getPermutation(int n, int k) {
	        List<Integer> numbers = new ArrayList<Integer>();
	        int factorial[] = new int[n+1];
	        StringBuilder sb = new StringBuilder();
	        
	        for(int i = 1;i<=n;i++){
	        	numbers.add(i);
	        }
	        factorial[0] = 1;
	        int mul =1;
	        for(int j = 1;j<=n;j++){
	        	mul = mul *j;
	        	factorial[j] = mul;
	        }
	        k = k-1;
	        int i = 1;
	        while(i <= n){
	        int pos = k/factorial[n-i];
	        sb.append(""+numbers.get(pos));
	        numbers.remove(pos);
	        /*if(k<temp){
	        	k = 0;
	        }*/
	        //else{
	        k = k-(pos*factorial[n-i]);
	        i++;
	       // }
	        
	        }
	        		
	        		return sb.toString();
	        
	    }


	}


