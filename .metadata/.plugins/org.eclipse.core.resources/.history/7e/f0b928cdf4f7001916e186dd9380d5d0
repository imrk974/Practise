package org.udemy.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class Names implements Comparable<Names> {
	private String name;

	public Names(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Names o) {
		if (name.length() == o.name.length()) {
			return 0;
		} else if (name.length() < o.name.length()) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		return name;
	}

}

public class CompareCollection {

	public static void main(String[] args) {
		List<Names> ls = new ArrayList<>();
		ls.add(new Names("Raesh"));
		ls.add(new Names("Tah"));
		ls.add(new Names("Aasdwqdwqdwqdwqdwqdskesh"));
		ls.add(new Names("Bakeassdsadwdqwdsh"));
		ls.add(new Names("Yaksh"));
		ls.add(new Names("Uakasdasdesh"));
		ls.add(new Names("Casdasdasdasdesh"));
		CompareCollection cc = new CompareCollection();
		cc.printList(ls);
		System.out.println("********************");
		Collections.sort(ls);
		cc.printList(ls);
		
	}
	
	void printList(List<Names> lst) {
		ListIterator<Names> it = lst.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
