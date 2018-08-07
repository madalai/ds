package com.ds.randomalgos;

/**
 * Given a number which is odd initially and we can swap any two digits and we
 * can swap only once.Now the problem is that we have to find the maximum
 * possible even number that can be formed using the above constraints Example
 * input:121 output:112
 * 
 * Approach:
 * 
 * @author madalai
 *
 */
public class MaximumPossibleEvenNumber {
	char[] arr;

	public int findMaxEvenNumber(int n) {
		String number = "" + n;
		arr = number.toCharArray();
		int lastElement = Integer.parseInt("" + arr[arr.length - 1]);
		int latestEvenIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			int index = Integer.parseInt("" + arr[i]);
			if ((index % 2) == 0) {
				latestEvenIndex = i;
				if (index < lastElement) {
					swap(i,arr.length-1, arr);
					return number(arr);

				}
			}
		}
		swap(latestEvenIndex, arr.length - 1, arr);
		return number(arr);

	}

	private int number(char[] arr) {
		String number = "";
		for (char c : arr) {
			number = number + c;
		}

		return Integer.parseInt(number);
	}

	private void swap(int index, int lastElement, char arr[]) {
		char temp = arr[index];
		arr[index] = arr[lastElement];
		arr[lastElement] = temp;

	}
	
	public static void main(String[] args) {
		MaximumPossibleEvenNumber obj = new MaximumPossibleEvenNumber();
		System.out.println(obj.findMaxEvenNumber(12345));
	}

}
