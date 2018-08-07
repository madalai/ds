package com.ds.randomalgos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public int firstUniqChar(String s) {
        int arr[] = new int [26];
        
        for(int i = 0 ; i<s.length();i++){
            int pos  = s.charAt(i) - 'a';
            arr[pos] = arr[pos]+1;
        }
        
        for(int i = 0 ; i<s.length();i++){
            int pos  = s.charAt(i) - 'a';
            if(arr[pos] == 1){
                return i;
            }
        }
        
        return -1;
    }
	 public int compareVersion(String version1, String version2) {
	        
	        String v1[] = version1.split("\\.");
	        String v2[] = version2.split("\\.");
	        int l1 = v1.length;
	        int l2 =  v2.length;
	        int n = l1 > l2 ? l2 : l1;
	        
	        for(int i = 0 ; i < n ;i++){
	            Integer n1 = Integer.parseInt(v1[i]);
	            Integer n2 = Integer.parseInt(v2[i]);
	            
	            if(n1 > n2){
	                return 1;
	            }
	            if(n1 < n2){
	                return -1;
	            }
	        
	        }
	        if(l1 == l2){
	            return 0;
	        }
	        if(l1 > l2){
	            if(allZeros(v1,l2,l1-1))
	            return 0;
	            return 1;
	        }
	        else{
	            if(allZeros(v2,l1,l2-1))
	            return 0;
	            return -1;
	        }
	        
	    }
	    
	    public boolean allZeros(String v[],int start,int end){
	        for(int i = start;i<=end;i++){
	        	int a = Integer.parseInt(v[i]);
	            if(a != 0){
	                return false;
	            }
	            
	        }
	        return true;
	    }
    public String reverseWords(String s) {
    	
        
    	 if(s == null || s.length() == 0){
             return s;
         }
         
         StringBuilder sb = new StringBuilder();
         String []arr = s.split(" ");
         
         for(int i = arr.length-1 ; i >= 0; i--){
             if(arr[i].length() > 0){
                 sb.append(arr[i]);
                 if(i !=  0){
                     sb.append(" ");
                 }
             }
         }
         
         return sb.toString().trim();
        
        
        
    }
    public static void main(String[] args) {
    	
    	StringBuffer sb = new StringBuffer();
    	String s = "";
    	
    	
    	
    	//System.out.println(new Main().firstUniqChar("leetcodel"));
    	
    	List<Integer> list = new ArrayList<>();
    	list.add(1);list.add(2);list.add(3);
    	List<List<Integer>> main = new ArrayList<>();
    	main.add(list);
    	
    	List<Integer> list2 = new ArrayList<>();
    	list2.add(2);list2.add(1);list2.add(3);
    	
    	//System.out.println(list.equals(list2));
    	System.out.println(main.contains(list2));
    }
    /*
public static void main(String[] args) {
	ListNode l1 = new ListNode(1);
	l1.next = new ListNode(5);
	l1.next.next = new ListNode(7);
	
	ListNode l2 = new ListNode(1);
	l2.next = new ListNode(3);
	l2.next.next = new ListNode(6);
	
	ListNode head =mergeTwoLists(l1,l2);
	
	while(head != null){
		System.out.println(head.val);
		head = head.next;
	}
	
	
}

public static  boolean isValid(String s) {
	
	
    Stack<Character> stack = new Stack<Character>();
    char[] chArr = s.toCharArray();
    for(int i = 0 ; i <chArr.length ; i++){
        if(isOpen(chArr[i])){
            stack.push(chArr[i]);
        }
        else{
        	if(stack.isEmpty()){
        		return false;
        	}
            char c = stack.pop();
            if(!isProperClose(chArr[i], c)){
                return false;
            }
        }
    }
    if(stack.isEmpty())
    return true;
    return false;
    
}

private static boolean isProperClose(char chArr, char c) {
	//return chArr != c;
	if(chArr == ')' && c == '('){
		return true;
	}
	if(chArr == '}' && c == '{'){
		return true;
	}
	if(chArr == ']' && c == '['){
		return true;
	}
	return false;
}

public static boolean isOpen(char c){
    if(c == '(' || c == '{' || c == '['){
        return true;
    }
    return false;
}

public static boolean isPalindrome(int x) {
	
	return true;
	
}


public static  ListNode mergeTwoLists(ListNode l1, ListNode l2) {
	ListNode l3 = null;
	ListNode head = null;
	ListNode temp;
	
	while(l1 != null || l2 != null){
		
		if(l1 == null){
			l3 = l2;
			break;
		}
		if( l2 == null){
			l3 = l1;
			break;
		}
		
		if(l1.val > l2.val){
			if(head == null){
			l3 = new ListNode(l2.val);
			head = l3;
			temp = l3.next;
			}
			temp = new ListNode(l2.val);
			temp = temp.next;
			
			l2 = l2.next;
		}
		else{
			if(head == null){
				l3 = new ListNode(l1.val);
				head = l1;
				temp = l1.next;
				}
			temp = new ListNode(l1.val);
			temp = temp.next;
			
			l1 = l1.next;
		}
		
	
	
	}
	
	
	
	return head;
    
}

*/}

