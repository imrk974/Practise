package org.udemy.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsSorting {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<String>();
		ls.add("Rakesh");
		ls.add("Makesh");
		ls.add("Uakesh");
		ls.add("Aakesh");
		ls.add("Iakesh");
		ls.add("Fakesh");
		
		System.out.println(ls);
		ls.sort(null);
		System.out.println("************");
		System.out.println(ls);
		System.out.println("************");
		Collections.reverse(ls);
		System.out.println(ls);
	}

}