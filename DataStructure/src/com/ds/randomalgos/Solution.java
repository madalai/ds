package com.ds.randomalgos;

import java.util.HashSet;
import java.util.Set;

class Solution {
	public static void main(String[] args) {
		Solution obj = new Solution();
		String s  ="abbabc";
		System.out.println(obj.lengthOfLongestSubstring(s));
	}
	public int lengthOfLongestSubstring(String s) {
		   int i = 0, j = 0, max = 0;
		    Set<Character> set = new HashSet<>();
		    
		    while (j < s.length()) {
		        if (!set.contains(s.charAt(j))) {
		            set.add(s.charAt(j++));
		            max = Math.max(max, set.size());
		        } else {
		            set.remove(s.charAt(i++));
		        }
		    }
		    
		    return max;
		
	}
	


}

