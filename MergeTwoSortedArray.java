package com.ds.array;

public class MergeTwoSortedArray {
	
	public static void main(String[] args) {
		int a[] = {1,4,6,8,9,13};
		int b[] = {2,5,7,10,11,15};
		for(int a1:merge(a,b)){
			System.out.print(a1+",");
		}
	}

	public static int[] merge(int a[], int b[]) {
		int l1 = a.length;
		int l2 = b.length;

		int c[] = new int[l1 + l2];

		int i = 0;
		int j = 0;
		int k = 0;
		while (k < l1 + l2) {
			if (i == l1) {
				c[k] = b[j];
				k++;
				j++;
				continue;
			}
			if (j == l2) {
				c[k] = a[i];
				k++;
				i++;
				continue;
			}
			if (a[i] <= b[j]) {
				c[k] = a[i];
				i++;
				k++;
			} else {
				c[k] = b[j];
				k++;
				j++;

			}

		}
		return c;
	}

}
