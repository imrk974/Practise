package com.DataStructure;

import java.util.Arrays;

public class BubbleSort {

	public static void swap(int[] a, int i, int j) {
		if(i==j) {
			return;
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {45,2,7,-2,-15,8};
		
		for (int unsortedArrIndex = arr.length-1; unsortedArrIndex > 0; unsortedArrIndex--) {
			for (int i=0; i < unsortedArrIndex; i++) {
				if(arr[i] > arr[unsortedArrIndex]) {
					swap(arr, i, unsortedArrIndex);
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
