package org.udemy.exercise;


class Data<K extends Integer, V extends GenericsTest> {

	private  K d1;
	private  V d2;
	private  float d3;

	public Data(K key, V Value) {
		this.d1 = key;
		this.d2 = Value;
	}
	
	public int getD1() {
		return d1;
	}

	public V getD2() {
		return d2;
	}

	public float getD3() {
		return d3;
	}

	@Override
	public String toString() {
		return "Data [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}

	public <E extends Integer, N extends GenericsTest> void display(E element, N number) {
		System.out.println("Element : " + element + " AND Number : " + number);
	}

}

public class GenericsTest {
	int a = 10;
	public int geta(int a) {
		return this.a = a;
				
	}
	
	public String toString() {
		return "kuch v ";
	}
	public static void main(String[] args) {
		GenericsTest g = new GenericsTest();
		Data<Integer, GenericsTest> d = new Data<Integer, GenericsTest>(1, new GenericsTest());

		d.display(2, g);

	}

}
