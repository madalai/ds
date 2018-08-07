package com.ds.randomalgos;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LRUCache {

    Map<Integer,Integer> map = new HashMap<>();
    Set<Integer> set = new LinkedHashSet<>();
    int capacity;
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            if(set.contains(key)){
               set.remove(key); 
            }
            set.add(key);
            return map.get(key) ;
        }
        return -1;
    }
    
    public void put(int key, int value) {
        if(map.containsKey(key)){
            map.put(key,value);
            return;
        }
        if(map.size() == capacity ){
           int key1 =  set.iterator().next();
            map.remove(key1);
        }
        map.put(key,value);
        
        
        
    }
    
    public static void main(String[] args) {
    	LRUCache cache = new LRUCache(2);
    	cache.put(1, 1);
    	cache.put(2, 2);
    	System.out.println(cache.get(1));       // returns 1
    	cache.put(3, 3);    // evicts key 2
    	System.out.println(cache.get(2));       // returns -1 (not found)
    	cache.put(4, 4);    // evicts key 1
    	System.out.println(cache.get(1));       // returns -1 (not found)
    	System.out.println(cache.get(3));       // returns 3
    	System.out.println(cache.get(4));       // returns 4
	}
}


/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
