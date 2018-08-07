package com.ds.array;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public List<List<Integer>> permute(int nums[]) {
		List<List<Integer>> mainList = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		for (int a : nums) {
			list.add(a);
		}

		backtrack(list, mainList, new ArrayList<Integer>());
        
		return mainList;
	}

	private void backtrack(List<Integer> list, List<List<Integer>> mainList, List<Integer> choose) {
		
		if(list.size() == 0){
			mainList.add(new ArrayList<>(choose));
			return;
		}
		
			for(int i = 0;i<list.size();i++){
				Integer a  = list.get(i);
				choose.add(a);
				list.remove(a);
				backtrack(list, mainList, choose);
				choose.remove(a);
				list.add(i, a);
			}
		
		
	}

	public List<String> permute(String s) {
		List<String> list = new ArrayList<>();
		StringBuffer sb = new StringBuffer(s);
		backtrack(sb, new StringBuffer(), list);
		return list;
	}

	private void backtrack(StringBuffer s, StringBuffer choosen, List<String> list) {

		if (s.length() == 0) {
			list.add(choosen.toString());
		}

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			choosen = choosen.append(c);
			s = s.replace(i, i + 1, "");
			backtrack(s, choosen, list);
			choosen = choosen.replace(choosen.length() - 1, choosen.length(), "");
			s = s.insert(i, c);

		}

	}

	public static void main(String[] args) {
		Permutations obj = new Permutations();
		 int nums[] = { 1, 2, 3 };
		 obj.permute(nums);
		System.out.println(obj.permute("1"));
	}
}
