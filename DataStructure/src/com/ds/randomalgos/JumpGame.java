package com.ds.randomalgos;

public class JumpGame {
	public static void main(String[] args) {
		JumpGame obj = new JumpGame();
		int arr[] = {3,2,1,0,4};
		System.out.println(obj.canJump(arr));
	}
	 public boolean canJump(int[] arr) {
	        if(arr == null || arr.length == 0)
	            return false;
	        return helper(arr,0,false);
	    }
	    public boolean helper(int arr[],int start,boolean found){
	        if(found || start == arr.length){
	            found = true;
	            return true;
	        }
	        if(start == 0 && arr.length==0){return true;}
	        if(start > arr.length){return false;}
	        boolean res = false;
	        for(int i=1;i<=arr[start] ;i++){
	            if(found){
	                break;
	            }
	            res = res || helper(arr,start+i,found);
	        }
	        return res;
	        
	    }
}
