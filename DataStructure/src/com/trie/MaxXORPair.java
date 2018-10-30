package com.trie;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MaxXORPair {
	 public static void main(String[] args) throws Exception{
         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(reader.readLine());
            for(int i=0;i < t ;i++){
                int n = Integer.parseInt(reader.readLine());
               int arr[] = new int[n];
                String s = reader.readLine();
                String str[] = s.split(" ");
               TrieNode root = new TrieNode();
                int j=0;
                for(String s1 : str){
                    int num = Integer.parseInt(s1); 
                    insert(root,num);
                    arr[j]=num;
                    j++;
                }
                int maxXor = 0;
                
    for(int key:arr){
                  TrieNode tmp = root;
                  int ans = 0;
         for(int k = 20 ; k >= 0 ;k--){
            if(isSetBit(key,k)){
                if(tmp.left != null){
                    ans = ans + (1 << k);
                    tmp = tmp.left;
                }else{
                    tmp = tmp.right;
                }
                
                
            }else{
                if(tmp.right != null){
                ans = ans + (1 << k);
                    tmp = tmp.right;
                    
                }else{
                     tmp = tmp.left;
                }
               
            }
            if(ans  > maxXor){
                maxXor = ans;
            }
        }
    }
                System.out.println(maxXor);
                
                
            }
    }
    public static void insert(TrieNode root,int n){
        for(int i = 20 ; i >= 0 ;i--){
            if(isSetBit(n,i)){
                if(root.right == null)
                root.right = new TrieNode();
                root = root.right;
            }else{
                if(root.left == null)
                root.left = new TrieNode();
                root = root.left;
            }
        }
    }
    
    private static boolean isSetBit(int n, int i) {
		if((n & (1 << i)) == 0){
			return false;
		}
		return true;
	}


}
class TrieNode1{
	TrieNode left;
	TrieNode right;
    public TrieNode1(){
        
    }
}