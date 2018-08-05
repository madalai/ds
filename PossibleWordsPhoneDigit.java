package com.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PossibleWordsPhoneDigit {
	static Map<Character,List<Character>> map = new HashMap<>();
	int depth = 0;
	
	char chArr[];
	static{
		initialize();
	}
	public static void main(String[] args) {
		new PossibleWordsPhoneDigit().printWords("234");
	}
	public void printWords(String nums){
		
		chArr = nums.toCharArray();
		depth = nums.length();
		
		
		printWord(map.get(chArr[0]),"");
	}
	
	
	private void printWord(List<Character> list, String word) {
		
		//System.out.println("Method Call : List->"+ printList(list) + " ,Word ->"+word+" ,idx->"+idx);
		
		for(int i = 0 ; i< list.size() ;i++){
			
			if(word.length() < depth-1){
			
			
			printWord(map.get(chArr[word.length()+1]),word+ list.get(i));
			
			
			}
			else{
				
				System.out.println(word+list.get(i));
			}
			
		}
		
		
	}


	private String printList(List<Character> list) {
		String s = "";
		for(Character ch : list){
			s+=ch;
		}
		return s;
	}
	private static void initialize() {
		List<Character> l1 = new ArrayList<Character>();
		l1.add('a');l1.add('b');l1.add('c');
		map.put('2', l1 );
		
		
		List<Character> l2 = new ArrayList<Character>();
		l2.add('d');l2.add('e');l2.add('f');
		map.put('3', l2 );
		
		List<Character> l3 = new ArrayList<Character>();
		l3.add('g');l3.add('h');l3.add('i');
		map.put('4', l3 );
	}

}
