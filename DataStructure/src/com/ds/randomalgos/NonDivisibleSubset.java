package com.ds.randomalgos;

public class NonDivisibleSubset {
	
	public static void main(String[] args) {
		int arr[] = {278,576,496,727,410,124,338,149,209,702,282,718,771,575,436};
		System.out.println(nonDivisibleSubset(3, arr));
	}
    static int nonDivisibleSubset(int k, int[] S) {

        return helper(S,new int[S.length],0,0,0,k);

    }
    
    public static int helper(int given[],int choosen[],int givenIdx,int choosenIdx,int maxLength,int k){
        if(givenIdx == given.length){
            if(check(choosen,k,choosenIdx)){
            	
                if(choosenIdx > maxLength){
                    maxLength = choosenIdx;
                }
            }
            return maxLength;
        }
        choosen[choosenIdx] = given[givenIdx];
        int a = helper(given,choosen,givenIdx+1,choosenIdx+1,maxLength,k);
        choosen[choosenIdx] = 0;
        int b = helper(given,choosen,givenIdx+1,choosenIdx,maxLength,k);
        return Math.max(a,b);
    }

    public static boolean check(int arr[],int k,int length){
        for(int i = 0 ; i<length-1 ; i++){
            for(int j = i+1 ; j<length ;j++){
                if((arr[i]+arr[j])%k == 0){
                    return false;
                }
            }
        }
        return true;
    }

}
