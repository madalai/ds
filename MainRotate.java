package com.ds.array;

public class MainRotate {

	public void rotate(int[] nums, int k) {

		int n = nums.length;
		int arr[] = new int[n];
		for(int i =0 ; i < n ; i++){
			arr[i] = nums[i];
		}
		if (k >= n) {
			k = k - n;
		}

		for (int j = 0; j < n; j++) {
			int pos = j - k;
			if(pos < 0){
				pos = n+ pos;
			}
			
			
          nums[j] = arr[pos];
		}
	}

	public static void main(String[] args) {
		MainRotate obj = new MainRotate();
		int arr[] = { 1, 2, 3, 4, 5, 6 };

		obj.rotate(arr, 8);
		System.out.println(arr);

	}
}
