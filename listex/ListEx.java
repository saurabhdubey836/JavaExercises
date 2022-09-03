package com.listex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Vector;

public class ListEx {

	public static void main(String[] args) {

		//ArrayList
//		List<String> str = new ArrayList<>(Arrays.asList("www","abcd")); // 16
		
//		System.out.println(str.size());
//		str.add("abcd");
//		String[] strarr = {"aa","ss","rrr","aa",null,null};
//		str.addAll(Arrays.asList(strarr));
//		Collections.addAll(str, "fff","sgsg");
//		System.out.println(str);
		
		//iterator listIterator  stream Enumeration 
		
//		Iterator<String> itr = str.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next() );
//		}
		
		//list Iterator
//		ListIterator<String> litr = str.listIterator();
//		while(litr.hasPrevious()) {
//			System.out.println(litr.previous());
//		}
		
//		
//		ArrayList<Integer> intColl = new ArrayList<>();
//		intColl.add(10);  // int --> INteger -->Autoboxing
//		Collections.addAll(intColl, 10,30,40);
//		intColl.add(3,20);
//		intColl.remove(0);
//		System.out.println(intColl);
		
		// stream
//		intColl.stream().forEach(System.out::println); //method reference 
		
		//Enumeration
		
		//vector 
		Vector<String> strvec = new Vector<>();
		System.out.println(strvec.capacity());
		strvec.add("str1");
		strvec.add("str1");
		strvec.add("str1");
		System.out.println(strvec.size());
		strvec.trimToSize();
		System.out.println(strvec.capacity());
		System.out.println(strvec.isEmpty());
		System.out.println(strvec.contains("str1"));
		strvec.clear();
		System.out.println(strvec.isEmpty());
		
		Enumeration<String> enem = Collections.enumeration(strvec);
		
		while(enem.hasMoreElements()) {
			System.out.println(enem.nextElement());
		}
		
		//Linkedlist as stack and queue FIFO LIFO
		LinkedList<String> strll = new LinkedList<>();  
		strll.add("str1");
		strll.push("str2"); //ll as stack
		strll.push("str3");//ll as stack
		strll.addFirst("str4");  // ll as queue
		strll.addLast("str5");// ll as queue
		strll.addFirst("str6");  // ll as queue
		System.out.println(strll);
		
		
		List<Integer> intarr = Collections.emptyList();
		
	}
	

}
