package com.ds.array;

/**
 * Given an array of positive integers. All numbers occur even number of times
 * except one number which occurs odd number of times.
 * 
 * @author madalai
 *
 */
public class OddOccuerencelement {
//Simple approch by two loops and get count of each element
	//same via hashmap
	
	//via xor gate
	
	public int getOddOccurrence(int arr[], int ar_size) 
    {
       int element = 0;
       for(int i = 0; i<ar_size;i++){
    	   element = element ^ arr[i];
       }
       return element;
    }
 
    public static void main(String[] args) 
    {
    	OddOccuerencelement occur = new OddOccuerencelement();
        int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
        int n = ar.length;
        System.out.println(occur.getOddOccurrence(ar, n));
    }
}

