package com.ds.randomalgos;
import java.util.*;
public class NthNumberFomPermutationSequence {
	public static void main(String[] args) {
		String s = new NthNumberFomPermutationSequence().getPermutation(4, 14);
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
        while(sb.length() != 4){
        int pos = k/factorial[n-1];
        sb.append(""+numbers.get(pos));
        numbers.remove(pos);
        k = k %n;
        n = n-1;
        }
        		
        		return sb.toString();
        
    }
}
