package com.ds.randomalgos;

/*
 * n eggs and k floors . find min number of trials
 */
public class EggDropProblem {

	public static void main(String[] args) {
		EggDropProblem obj  = new EggDropProblem();
		System.out.println(obj.eggDrop(2, 8));
	}
	public int eggDrop(int n,int k){
		
		if(k == 0 || k == 1 || n == 1){
			return k;
		}
		
		int min = Integer.MAX_VALUE;
		
		for(int i = 1 ; i <= k ; i++){
			int temp = 1+ Math.max(eggDrop(n-1, i-1), eggDrop(n, k-i));
			if(temp < min){
				min = temp;
			}
			
		}
		
		return min;
	}
}
