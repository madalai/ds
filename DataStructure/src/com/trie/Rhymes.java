package com.trie;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Given is a wordlist L, and a word w. Your task is to find the length of the
 * longest word in L having the longest common suffix with w.
 * https://www.hackerrank.com/contests/smart-interviews/challenges/si-rhymes/problem
 * 
 * @author madalai
 *
 */
public class Rhymes {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        TrieNode root = new TrieNode();
        for (int p = 0; p < t; p++) {
            String s = reader.readLine();
            insertToTrie(root, s);
        }
        int q = Integer.parseInt(reader.readLine());
        for (int i = 0; i < q; i++) {
            String s = reader.readLine();
            System.out.println(maxSuffix(root, s));
        }
    }

    public static void insertToTrie(TrieNode root, String s) {
        int i = 1;
        for (int j = s.length() - 1; j >= 0; j--) {
            int pos = s.charAt(j) - 'a';
            if (root.arr[pos] == null) {
                root.arr[pos] = new TrieNode();
            }
            root.arr[pos].depth = Math.max(root.arr[pos].depth, s.length() - i);
            root = root.arr[pos];
            i++;
        }
    }

public static int maxSuffix(TrieNode root, String s) {
        if(root.arr[s.charAt(s.length()-1) - 'a'] == null){
            return 0;
        }
        TrieNode tmp = root;
        for (int i = s.length() - 1; i >= 0; i--) {
            int pos = s.charAt(i) - 'a';
            if (tmp.arr[pos] != null) {
                root = tmp;
                tmp = tmp.arr[pos];
            } else {
                return tmp.depth + s.length() - i-1;
            }
        }
        return tmp.depth+s.length();
    }
}

class TrieNode {
    int depth;
    TrieNode arr[];

    public TrieNode() {
        arr = new TrieNode[26];
    }
}