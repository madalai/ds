package com.ds.array;

public class RotateArrayByGCDOrJugglingAlgo {
	
	public static void rotate(int arr[],int noOfTimes,int length){
		int noOfSets = gcd(length,noOfTimes);
		for(int i=0;i<noOfSets;i++){
			int j =i;
			int temp = arr[j];
			while(true){
				int d =(j+noOfTimes)%length;
				if(d == i){
					arr[j] = temp;
					break;
				}
				arr[j] = arr[d];
				j = d;
			}
			
		}
	}

	private static int gcd(int a, int b) {
		if(a == 0 || b ==0){
			return a+b;
		}
		return gcd(b,a%b);
	}
	
	public static void main(String[] args) {
		int arr[] = new int[5];
		for(int i =0;i<5;i++){
			arr[i] = i+1;
		}
		
		rotate(arr, 2, 5);
		ArrayUtil.printArray(arr);
	}

}
