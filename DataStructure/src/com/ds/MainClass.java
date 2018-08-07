package com.ds;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class MainClass {

	public static void main(String[] args) throws IOException {
		System.out.println("Jay Jagannath");
		
		Set<String> list1 = new HashSet<String>();
		Set<String> list2 = new HashSet<String>();
		
		BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\madalai.ORADEV\\Desktop\\File1.txt"));
		BufferedReader reader2 = new BufferedReader(new FileReader("C:\\Users\\madalai.ORADEV\\Desktop\\File2.txt"));
		
		    
		 String contentLine1 = reader1.readLine();
		   while (contentLine1 != null) {
			   list1.add(contentLine1);
		      contentLine1 = reader1.readLine();
		   }
		   
		   String contentLine2 = reader2.readLine();
		   while (contentLine2 != null) {
			   list2.add(contentLine2);
		      contentLine2 = reader2.readLine();
		   }
		   
		   System.out.println(list1.containsAll(list2));
		   
		   for(String s:list2){
			   if(!list1.contains(s)){
				   System.out.println(s);
			   }
		   }
	}
}
