package com.ds.randomalgos;

/**
 * https://www.geeksforgeeks.org/reach-the-numbers-by-making-jumps-of-two-given-lengths/
 * 
 * @author madalai
 *
 */
public class ReachNumbersByMakingJump {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 4, 3 };
		ReachNumbersByMakingJump obj = new ReachNumbersByMakingJump();

		obj.possibleReach(arr, 2, 3, 2);
	}

	public void possibleReach(int arr[], int d1, int d2, int k) {
		boolean vis[] = new boolean[arr.length];
		helper(arr, d1, d2, k, vis);

		for (int i = 0; i < arr.length; i++) {
			if (vis[i]) {
				System.out.println(i);
			}
		}

	}

	private void helper(int[] arr, int d1, int d2, int k, boolean vis[]) {

		if (k < 0 || k >= arr.length || vis[k]) {
			return;
		}
		vis[k] = true;
		helper(arr, d1, d2, k - d1, vis);
		helper(arr, d1, d2, k + d1, vis);
		helper(arr, d1, d2, k - d2, vis);
		helper(arr, d1, d2, k + d2, vis);

	}
}
