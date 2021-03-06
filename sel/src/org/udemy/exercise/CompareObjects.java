package org.udemy.exercise;

import java.util.ArrayList;
import java.util.List;

class employee {

	private String empName;
	private int empID;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpLocation() {
		return empLocation;
	}

	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}

	private String empLocation;

	@Override
	public String toString() {
		return "employee [empName=" + empName + ", empID=" + empID + ", empLocation=" + empLocation + "]";
	}
	
	

}

public class CompareObjects {
	
	public static void main(String[] args) {
		employee e = new employee();
		e.setEmpID(1);
		e.setEmpLocation("Bangalore");
		e.setEmpName("Rakesh");
		
		List<employee> list = new ArrayList<employee>();
		list.add(e);
		System.out.println(list);
		System.out.println("*******************");
		list.sort(null);
		System.out.println(list);
	}

}
