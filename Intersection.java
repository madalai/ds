package com.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection {
	
public int[] intersect(int[] nums1, int[] nums2) {
        
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int n1 : nums1){
            int value = 1;
        
            if(map.containsKey(n1)){
            	value += map.get(n1);
            }
            map.put(n1,value);
        }
        
        for(int n2:nums2){
            if(map.containsKey(n2) && map.get(n2)>0){
                list.add(n2);
                int v = map.get(n2)-1;
                map.put(n2,v);
            }
        }
        
        int arr[] = new int[list.size()];
        int i = 0;
        for(int n : list){
        	arr[i] = n;
        	i++;
        }
        return arr;
    }

public static void main(String[] args) {
	int arr1[] = {1,2,2,1};
	int arr2[] = {2,2};
	int arr[] = new Intersection().intersect(arr1,arr2);
	
	for(int a : arr){
		System.out.println(a);
	}
}


}
