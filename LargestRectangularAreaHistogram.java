package com.ds.array;

/**
 * Find the largest rectangular area possible in a given histogram where the
 * largest rectangle can be made of a number of contiguous bars. For simplicity,
 * assume that all bars have same width and the width is 1 unit.
 * 
 * @author madalai
 *
 */
public class LargestRectangularAreaHistogram {

	public int maxRectangleArea(int arr[]){
		int maxArea = -1;
		for(int i = 0 ; i < arr.length ;i++){
			for(int j = i+1 ;j <arr.length ;j++){
				int min = Integer.MAX_VALUE;
				for(int k = i ; k <=j ;k++){
					if(arr[k]<min ){
						min = arr[k];
					}
				}
					int area = min * (j-i+1);
					if(area > maxArea){
						maxArea = area;
					}
				
				
			}
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		int arr[] = {6, 2, 5, 4, 5, 1, 6};
		LargestRectangularAreaHistogram obj = new LargestRectangularAreaHistogram();
		System.out.println(obj.maxRectangleArea(arr));
	}
}
