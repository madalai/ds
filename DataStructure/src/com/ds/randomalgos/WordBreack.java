package com.ds.randomalgos;

import java.util.ArrayList;
import java.util.List;

public class WordBreack {
	
	public List<String> wordBreak(String s, List<String> dict) {
		List<String> list = new ArrayList<String>();
		backtrack(s,list,"",dict);
		
		
		return list;
		
	}

	private void backtrack(String given, List<String> list, String choosen,List<String> dict) {
		
		
		
	}

}
