package com.ds.randomalgos;

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main1 {

	public static void main(String[] args) {
		Main1 obj = new Main1();
		int arr[] = { 1, 2, -2, -1, 0 };

		List<List<Integer>> l = obj.threeSum(arr);
		System.out.println("Hi");

	}

	public List<List<Integer>> threeSum1(int[] num) {
		Arrays.sort(num);
		List<List<Integer>> res = new LinkedList<>();
		for (int i = 0; i < num.length - 2; i++) {
			if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
				int lo = i + 1, hi = num.length - 1, sum = 0 - num[i];
				while (lo < hi) {
					if (num[lo] + num[hi] == sum) {
						res.add(Arrays.asList(num[i], num[lo], num[hi]));
						while (lo < hi && num[lo] == num[lo + 1])
							lo++;
						while (lo < hi && num[hi] == num[hi - 1])
							hi--;
						lo++;
						hi--;
					} else if (num[lo] + num[hi] < sum)
						lo++;
					else
						hi--;
				}
			}
		}
		return res;
	}

	public List<List<Integer>> threeSum(int[] nums) {
		int l = nums.length;
		List<List<Integer>> iList = new ArrayList<List<Integer>>();
		Arrays.sort(nums);

		for (int i = 0; i < l - 2; i++) {
			if (i == 0 || (i > 0) && nums[i] != nums[i - 1]) {

				int low = i + 1;
				int high = l - 1;
				int sum = 0 - nums[i];
				

					
					while (low < high) {
					if (nums[low]+nums[high] == sum) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[low]);
						list.add(nums[high]);
						iList.add(list);
						while (low < high && nums[low] == nums[low + 1]) {
							low++;
						}
						while (low < high && nums[high] == nums[high - 1]) {
							high--;
						}
						low++;
						high--;
					} else if (nums[low]+nums[high] < sum) {
						low++;
					} else {
						high--;
					}
				}
			}
		}
		return iList;

	}
}
