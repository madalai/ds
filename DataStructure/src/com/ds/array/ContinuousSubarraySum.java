package com.ds.array;

import java.util.HashMap;
import java.util.Map;

public class ContinuousSubarraySum {

	public static void main(String[] args) {

		int nums[] = { 405, 504, 203, 96, 43, 50, 214, 327, 120, 345, 33, 314, 377, 62, 431, 379, 114, 208, 106, 345,
				391, 513, 9, 405, 452, 186, 295, 33, 423, 122, 355, 311, 192, 429, 320, 360, 85, 96, 32, 258, 407, 71,
				436, 370, 365, 199, 443, 521, 262, 232, 355, 241, 250, 10, 258, 324, 335, 446, 474, 385, 74, 101, 111,
				162, 349, 149, 51, 399, 371, 139, 199, 264, 118, 155, 134, 518, 388, 113, 520, 441, 384, 449, 14, 104,
				267, 92, 477, 50, 505, 368, 466, 519, 105, 443, 31, 21, 485, 146, 115, 94 };
		
		int nums1[] = {1,3,2,7};
		

		ContinuousSubarraySum obj = new ContinuousSubarraySum();
		//System.out.println(obj.checkSubarraySum(nums, 337));
		
		System.out.println(obj.checkSubarraySum1(nums, 337));
	}

	public boolean checkSubarraySum1(int[] nums, int k) {

		if (nums == null || nums.length < 2)
			return false;

		Map<Integer, Integer> map = new HashMap<>();
		int n = 0;
		for(int i = 0 ; i < nums.length ;i++){
			
			n = n + nums[i];
			
			n = n%k;
			if(map.containsKey(n)){
				if(i- map.get(n)   > 1){
					return true;
				}
			}
			map.put(n, i);
			
		}
		return false;
	}
	public boolean checkSubarraySum(int[] nums, int k) {

		if (nums == null || nums.length < 2)
			return false;

		return helper(nums, k, 0, nums.length - 1, false);
	}

	private boolean helper(int[] nums, int k, int start, int end, boolean found) {

		if (end - start < 1) {
			return false;
		}
		if (found) {
			return true;
		}
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += nums[i];
		}

		//System.out.println("Start:" + start + ", End:" + end + ", Sum : " + sum);
		if (k == 0 && sum == 0) {
			found = true;
			return true;
		}
		if (k != 0 && sum % k == 0) {
			found = true;
			return true;
		}

		return helper(nums, k, start + 1, end,found) || helper(nums, k, start, end - 1,found);

	}
}
