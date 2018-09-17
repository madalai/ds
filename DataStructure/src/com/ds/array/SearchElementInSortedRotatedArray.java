package com.ds.array;

import java.util.List;

/**
 * An element in a sorted array can be found in O(log n) time via binary search.
 * But suppose we rotate an ascending order sorted array at some pivot unknown
 * to you beforehand. So for instance, 1 2 3 4 5 might become 3 4 5 1 2. Devise
 * a way to find an element in the rotated array in O(log n) time.
 * 
 * @author madalai
 *
 */
public class SearchElementInSortedRotatedArray { public int search(final List<Integer> list, int key) {
    return helper(list,0,list.size()-1,key);
 }
 
 public int helper(List<Integer> list,int low,int high,int key){
     
     while(low <= high){
         int mid = low + (high -low)/2;
         if(list.get(mid) > list.get(0)){
             //This means mid is in left part of the pivot
             if(key == list.get(mid)){
                 return mid;
             }
             if(list.get(low) <= key && list.get(mid)> key){
                 high = mid-1;
             }
             else{
                 low = mid +1;
             }
         }
         else{
             //This means mid is in right part of the pivot
             if(key == list.get(mid)){
                 return mid;
             }
             if(list.get(mid) < key && list.get(high) >= key){
                 low = mid+1 ;
             }
             else{
                 high = mid-1;
             }
         }
         
     }
     if(list.get(low) == key){
         return low;
     }
     return -1;
  
     
   
 }
}
