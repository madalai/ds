package com.heap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Integer t = Integer.parseInt(reader.readLine());
		MinHeap obj = new MinHeap();
		for (int i = 0; i < t; i++) {
			String s = reader.readLine();
			String str[] = s.split(" ");
			
			if (str.length == 2) {
				obj.insert(Integer.parseInt(str[1]));
			} else {
				if ("getMin".equals(str[0])) {
					obj.getMin();
				} else {
					obj.deleteMin();
				}

			}
		}
	}

}

class MinHeap {
	private List<Integer> list;

	public MinHeap() {
		list = new ArrayList<Integer>();
	}

	public void insert(int n) {
		list.add(n);
		heapify();
	}

	private void heapify() {
		int curr = list.size() - 1;
		int par = curr / 2;
		while (list.get(curr) < list.get(par)) {
			int tmp = list.get(par);
			list.set(par, list.get(curr));
			list.set(curr, tmp);
			curr = par;
			par = curr/2;
		}
	}

	public void deleteMin() {
		if (list.size() == 0)
			return;
		if (list.size() == 1) {
			list.remove(0);
			return;
		}

		list.set(0, list.get(list.size() - 1));
		list.remove(list.size() - 1);
		int i = 0;
		while (i < list.size() && list.get(i) > Math.min(getLeft(i), getRight(i))) {
			if (getLeft(i) < getRight(i)) {
				int tmp = list.get(i);
				list.set(i, getLeft(i));
				list.set(2 * i + 1, tmp);
				i = 2 * i + 1;
			} else {
				int tmp = list.get(i);
				list.set(i, getRight(i));
				list.set(2 * i + 2, tmp);
				i = 2 * i + 2;
			}
		}

	}

	private int getLeft(int i) {
		if (2 * i + 1 > list.size() - 1) {
			return Integer.MAX_VALUE;
		} else {
			return list.get(2 * i + 1);
		}
	}

	private Integer getRight(int i) {
		if (2 * i + 2 > list.size() - 1) {
			return Integer.MAX_VALUE;
		} else {
			return list.get(2 * i + 2);
		}
	}

	public int getMin() {
		if (list.size() > 0) {
			System.out.println(list.get(0));
			return list.get(0);
		}
		System.out.println("Empty");
		return Integer.MIN_VALUE;
	}

}
