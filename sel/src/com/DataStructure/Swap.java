package com.DataStructure;

public class Swap {
	
	public static void swap(int[] a, int i, int j) {
		if (i == j) {
			return;
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}