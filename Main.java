package com.ds.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    static Map<Character,List<Character>> map =  new HashMap<>();
    char carr[];
    int depth = 0;
    static{
        List<Character> l1 = new ArrayList<Character>();
		l1.add('a');l1.add('b');l1.add('c');
		map.put('2', l1 );
		
		
		List<Character> l2 = new ArrayList<Character>();
		l2.add('d');l2.add('e');l2.add('f');
		map.put('3', l2 );
		
		List<Character> l3 = new ArrayList<Character>();
		l3.add('g');l3.add('h');l3.add('i');
		map.put('4', l3 );
        
        List<Character> l4 = new ArrayList<Character>();
		l4.add('j');l4.add('k');l4.add('l');
		map.put('5', l4 );
        
        List<Character> l5 = new ArrayList<Character>();
		l5.add('m');l5.add('n');l5.add('o');
		map.put('6', l5 );
        
        List<Character> l6 = new ArrayList<Character>();
		l6.add('p');l6.add('q');l6.add('r');l6.add('s');
		map.put('7', l6 );
        
        List<Character> l7 = new ArrayList<Character>();
		l7.add('t');l7.add('u');l7.add('v');
		map.put('8', l7 );
        
        List<Character> l8 = new ArrayList<Character>();
		l8.add('w');l8.add('x');l8.add('y');l8.add('z');
		map.put('9', l8 );
    }
    public List<String> letterCombinations(String digits) {
         List<String> list = new ArrayList<String>();
        depth = digits.length();
        if(digits == null || digits.length()==0){
            return list;
        }
       
        carr = digits.toCharArray();
        printCombinations(map.get(carr[0]),"",list);
        
        return list;
        
    }
    
    public void printCombinations(List<Character> letters,String word,List<String> finalWords){
        for(int i = 0 ; i<letters.size();i++ ){
            if(word.length() < depth -1){
                printCombinations(map.get(carr[word.length()+1]),word+letters.get(i),finalWords);
            }
            else{
                finalWords.add(word+letters.get(i));
            }
        }
    }
    
    
    public static void main(String[] args) {
		for(String s:new Main().letterCombinations("789")){
			System.out.println(s);
		}
	}

}
