package com.ds.tree;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class MainTree {  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(reader.readLine());

    for (int i = 0; i < t; i++) {
        int n = Integer.parseInt(reader.readLine());
        String s[] = reader.readLine().split(" ");
        int arr[] = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = Integer.parseInt(s[j]);
        }
        TreeNode root = constructTree(arr);
        
        System.out.println(isFull(root)?"True":"False");
    }
}
static boolean isFull(TreeNode root){
    if(root == null){
        return true;
    }
    if((root.left != null && root.right == null) || (root.left == null && root.right != null) ){
        return false;
    }
    return isFull(root.left)||isFull(root.right);
}
static TreeNode constructTree(int arr[]) {
    TreeNode root = new TreeNode(arr[0]);
    for (int i = 1; i < arr.length; i++) {
        insert(root, arr[i]);
    }
    return root;
}

static TreeNode insert(TreeNode root, int val) {
    if (root == null) {
        return new TreeNode(val);
    }
    if (root.val > val) {
        root.left = insert(root.left, val);
    } else {
        root.right = insert(root.right, val);
    }
    return root;

}
}
