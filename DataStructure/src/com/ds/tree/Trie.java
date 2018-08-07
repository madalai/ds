package com.ds.tree;

public class Trie {
	TrieNode head;

	/** Initialize your data structure here. */
	public Trie() {
		head = new TrieNode();
	}

	/** Inserts a word into the trie. */
	public void insert(String word) {
		if (word == null || word.isEmpty()) {
			return;
		}
		char ch[] = word.toCharArray();

		TrieNode curr = head;

		for (int i = 0; i < ch.length; i++) {
			int idx = ch[i] - 'a';
			if (curr.arr[idx] == null) {
				curr.arr[idx] = new TrieNode();
				//curr.arr[idx].val = ch[i];
				curr = curr.arr[idx];
			} else {
				curr = curr.arr[idx];
			}
			if (i == ch.length - 1) {
				curr.isEnd = true;
			}
		}
	}

	/** Returns if the word is in the trie. */
	public boolean search(String word) {
		if(word == null || word.isEmpty()){
			return false;
		}
		char ch[] = word.toCharArray();
		TrieNode curr = head;
		
		for(int i = 0 ; i<ch.length;i++){
			int idx = ch[i]-'a';
			if(curr.arr[idx] == null){return false;}
			curr = curr.arr[idx];
			if(i == ch.length-1){
				return curr.isEnd;
			}
		}
		return false;
	}

	/**
	 * Returns if there is any word in the trie that starts with the given
	 * prefix.
	 */
	public boolean startsWith(String prefix) {
		if(prefix == null || prefix.isEmpty()){
			return false;
		}
		char ch[] = prefix.toCharArray();
		TrieNode curr = head;
		
		for(int i = 0 ; i<ch.length;i++){
			int idx = ch[i]-'a';
			if(curr.arr[idx] == null){return false;}
			curr = curr.arr[idx];
			if(i == ch.length-1){
				return true;
			}
		}
		return false;
	}

	class TrieNode {
		boolean isEnd;
		TrieNode arr[] = new TrieNode[26];
		
	}
	
	public static void main(String[] args) {
		Trie obj = new Trie();
		obj.insert("app");
		obj.insert("appw");
		System.out.println(obj.startsWith("p"));
	}
}

