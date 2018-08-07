package com.hackerrank;

import java.io.*;
import java.util.*;

public class Solution {

    private StringBuffer word = new StringBuffer("");
    private StringBuffer prev = new StringBuffer("");
    public static void main(String[] args) {
    	System.out.println(isPowerOfThree(243));
    	System.out.println(Math.pow(3, 11));
    	
    }
    
public static boolean isPowerOfThree(int n) {
        
        if(n == 0){
            return false;
        }
        double  numerator = Math.log(n);
        double den = Math.log(3);
        int d = (int)Math.round(numerator/den);
        
        return Math.pow(3,d) == n ? true:false;
    }
    public void append(String s){
        if(prev.length()>0){
        prev.delete(0,prev.length());
        }
        prev.append(word);
            
        word.append(s);
    }
    public void delete(int k){
        if(prev.length()>0){
        prev.delete(0,prev.length());
        }
        prev.append(word);
        word.delete(word.length()-k,word.length());
    }
    public void print(int k){
        System.out.println(word.charAt(k-1));
    }
    public void undo(){
        if(word.length()>0)
        word.delete(0,word.length());
        word.append(prev);
    }
}
