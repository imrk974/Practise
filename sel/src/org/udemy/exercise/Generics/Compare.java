package org.udemy.exercise.Generics;

class feedIn<T extends FirstInput, X extends SecondInput> implements Comparable<X>{
	private T var1;
	private X var2;
	
	public feedIn(T t, X x) {
		var1 = t;
		var2 = x;
	}
	
	public T getVar1() {
		return var1;
	}

	public X getVar2() {
		return var2;
	}

	@Override
	public int compareTo(X o) {
		if(var1.getA()==o.getA() && var1.getB()==o.getB()){
			return 0;
		} else if (var1.getA()>o.getA() && var1.getB()>o.getB()) {
			System.out.println("Both value of firstclass is greate then second");
			return 1;
		} else {
			return -1;
		}
		
	}

	@Override
	public String toString() {
		return "feedIn [var1=" + var1 + ", var2=" + var2 + "]";
	}

	
}

public class Compare{
	
	

	public static void main(String[] args) {
		FirstInput f = new FirstInput(5, 7);
		SecondInput s = new SecondInput(9, 4);
		feedIn<FirstInput,SecondInput> feed = new feedIn<FirstInput, SecondInput>(f, s);
		System.out.println(feed.getVar1().getA() + "  " + feed.getVar2().getB());
		System.out.println(feed.compareTo(s));


	}

}
