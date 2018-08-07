package com.ds.randomalgos;

import java.util.ArrayList;
import java.util.List;

/**
 * The cost of a stock on each day is given in an array, find the max profit
 * that you can make by buying and selling in those days. For example, if the
 * given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can
 * earned by buying on day 0, selling on day 3. Again buy on day 4 and sell on
 * day 6. If the given array of prices is sorted in decreasing order, then
 * profit cannot be earned at all.
 * 
 * @author madalai
 *
 */
// *********************BUY ONCE AND SELL ONLY ONCE **********************
public class MaximumProfit {
	
	public static void findBestTrade(int arr[]) {

		int buyAt = -1;
		int sellAt = -1;
		int maxProfit = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				int diff = arr[j] - arr[i];
				if (diff > maxProfit) {
					buyAt = arr[i];
					sellAt = arr[j];
					maxProfit = diff;
				}
			}
		}

		System.out.println("Max profit =" + maxProfit);
		System.out.println("buy At : " + buyAt);
		System.out.println("sell At :" + sellAt);
	}
	
	public static List<Interval> findBestTrades(int arr[]) throws Exception{
		
		List<Interval> intervals = new ArrayList<>();
		int i =0;
		
		if (arr.length < 1){
			throw new Exception("Insufficent elements in Array");
		}
		
		while(i<arr.length-1){
			
			//find minima
			while((arr[i] > arr[i+1]) && i < arr.length -1){
				i++;
			}
			if(i == arr.length -1){
				break;
			}
			
			Interval obj = new Interval();
			obj.buy = arr[i];
			
			
			//find maxima
			while((i< arr.length -1) && (arr[i] < arr[i+1])){
				i++;
			}
			
			obj.sell = arr[i];
			
			//add to solution
			intervals.add(obj);
		}
		
		return intervals;
		
	}

	public static void main(String[] args) throws Exception{
		int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
		//findBestTrade(arr);
		
		for(Interval interval : findBestTrades(arr)){
			System.out.println("Buy at :"+interval.buy +", Sell at :"+interval.sell);
		}
	}

}
class Interval{
	int buy;
	int sell;
}

