package com.ds.randomalgos;

public class JugWaterProblem {
public boolean canMeasureWater(int x, int y, int z) {
        
        if((x <=0 || y<= 0) ||(z > (x+y))){
            return false;
        }
        int k = (x > y ) ? (x-y):(y-x);
        if(k == 0){
        	return false;
        }
        if((k == z) || (z == x+y)){
            return true;
        }
        else{
            return canMeasureWater(x-k,y,z) || canMeasureWater(x,y-k,z) || canMeasureWater(x-y, y, z) ||canMeasureWater(x, y-x, z) ;
        }
    }

public static void main(String[] args) {
	JugWaterProblem obj = new JugWaterProblem();
	System.out.println(obj.canMeasureWater(6, 9, 1));
}
}
