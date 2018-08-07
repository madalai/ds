package com.ds.randomalgos;

public class LongestNonRepeatingSubString {

	public static void main(String[] args) {
		String s = "abcabcbb";
		String s1 = "a";
		System.out.println(lengthOfLongestSubstring(s1));
	}
	
	public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        
        for(int i = 0; i < s.length()-1; i++){
            String temp = ""+s.charAt(i);
            int tempLength = 1;
            for(int j = i+1; j<s.length() ;j++){
                if(temp.contains(""+s.charAt(j))){
                    
                    break;
                    
                }
                temp = temp + s.charAt(j);
                    tempLength++;
                
            }
            if(tempLength > maxLength){
                maxLength = tempLength;
                
            }
        }
        
        return maxLength;
        
    }
}
