package com.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneKeyPadLetters {
	static Map<Integer, List<String>> map = new HashMap<>();
	public static void main(String[] args) {
		for(String s:helper("234")){
			System.out.println(s);
		}
	}
	public static List<String> helper(String str){
		
		if(str.length() == 1){
			return map.get(Integer.parseInt(str.substring(0, 1)));
		}
		if(str.length() == 2){
			List<String> l1 = map.get(Integer.parseInt(""+str.charAt(0)));
			List<String> l2 = map.get(Integer.parseInt(""+str.charAt(1)));
			List<String> res = new ArrayList<>();
			for(int i = 0 ; i <l1.size() ; i++){
				for(int j=0;j<l2.size() ;j++){
					res.add(l1.get(i)+l2.get(j));
				}
			}
			return res;
		}else{
			List<String> tmpRes = helper(str.substring(1));
			List<String> l1 = map.get(Integer.parseInt(str.substring(0, 1)));
			List<String> res = new ArrayList<>();
			for(int i = 0 ; i <l1.size() ; i++){
				for(int j=0;j<tmpRes.size() ;j++){
					res.add(l1.get(i)+tmpRes.get(j));
				}
			}
			return res;
		}
	}

	static {

		List<String> list2 = new ArrayList<>();
		list2.add("a");
		list2.add("b");
		list2.add("c");
		map.put(2, list2);
		
		List<String> list3 = new ArrayList<>();
		list3.add("d");
		list3.add("e");
		list3.add("f");
		map.put(3, list3);
		
		List<String> list4 = new ArrayList<>();
		list4.add("g");
		list4.add("h");
		list4.add("i");
		map.put(4, list4);
		
		List<String> list5 = new ArrayList<>();
		list5.add("j");
		list5.add("k");
		list5.add("l");
		map.put(5, list5);
		
		List<String> list6 = new ArrayList<>();
		list6.add("m");
		list6.add("n");
		list6.add("o");
		map.put(6, list6);
		
		List<String> list7= new ArrayList<>();
		list7.add("p");
		list7.add("q");
		list7.add("r");
		list7.add("s");
		map.put(7, list7);
		
		List<String> list8 = new ArrayList<>();
		list8.add("t");
		list8.add("u");
		list8.add("v");
		map.put(8, list8);
		
		List<String> list9 = new ArrayList<>();
		list9.add("w");
		list9.add("x");
		list9.add("y");
		list9.add("z");
		map.put(9, list9);
	}
}
