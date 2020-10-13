package org.udemy.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.prefs.BackingStoreException;

class employee implements Comparable<employee> {

	private String empName;
	private int empID;

	public String getEmpName() {
		return empName;
	}

	public int getEmpID() {
		return empID;
	}

	public employee(int empID, String empName, String empLocation) {
		this.empName = empName;
		this.empID = empID;
		this.empLocation = empLocation;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	private String empLocation;

	@Override
	public String toString() {
		return empID +" " + empName +" "+ empLocation;
	}

	@Override
	public int compareTo(employee o) {
		if (empName.length() == o.empName.length()) {
			return 0;
		} else if (empName.length() < o.empName.length()) {
			return -1;
		} else {
			return 1;
		}

	}

}

public class addCustomObjectinList {

	public static void main(String[] args) {
		//employee e = new employee(1,"Bangalore","Rakesh");

		List<employee> list = new ArrayList<employee>();
		list.add(new employee(1,"adsadqwedqewdi","Pune"));
		list.add(new employee(2,"dadasdasdasi","Hyd"));
		list.add(new employee(3,"kaqwdqwdi","MFP"));
		list.add(new employee(4,"taddwi","Chn"));
		list.add(new employee(5,"ugadi","Bang"));
		
		// list.add(e);
		System.out.println(list);
		System.out.println("*******************");
		list.sort(null);
		System.out.println(list);
	}

}