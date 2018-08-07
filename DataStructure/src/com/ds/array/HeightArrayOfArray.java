package com.ds.array;

import java.util.ArrayList;
import java.util.List;

/**
 * You have given height array of array. Generate the original array. 

Input: [6,3,0,2,2,0,0] 
Output : [ 1,5,7,3,2,6,4] 

A[i] value in input array is the number of greater element on right side.
 * @author madalai
 *
 */
public class HeightArrayOfArray {
	
	public static int[] findActualArray(int hightArray[]){
		int[] actualArray = new int[hightArray.length];
		List<Integer> list = new ArrayList<>();
		populatelist(list,hightArray.length);
		
		for(int i = 0; i< hightArray.length;i++){
			actualArray[i] = findNthBiggestNum(hightArray[i] + 1,list);
		}
		return actualArray;
	}

	private static int findNthBiggestNum(int i,List<Integer> list) {
		
		int index = list.size()-i;
		
		int num = list.get(index);
		list.remove(index);
		
		
		
		return num;
	}

	private static void populatelist(List<Integer> list,int n) {
		// TODO Auto-generated method stub
		for(int i =0; i<n; i++){
			list.add( i+1);
		}
		
	}
	
	public static void main(String[] args) {
		 int arr[] = { 6,3,0,2,2,0,0};
		 int actArray[] = findActualArray(arr);
		 //System.out.println(actArray.toString());
		 
		 for(int i = 0; i<actArray.length ; i++){
			 System.out.print(actArray[i]);
			 System.out.print(",");
		 }
		 
	}

}
