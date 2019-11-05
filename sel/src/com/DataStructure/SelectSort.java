package com.DataStructure;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {

		int[] ar = { 45, 23, 67, -22, -37, 6 };

		for (int lastunsortedIndex = ar.length - 1; lastunsortedIndex > 0; lastunsortedIndex--) {

			int largestIndex = 0;
			for (int i = 1; i < ar.length; i++) {

				if (ar[i] > ar[largestIndex]) {
					largestIndex = i;
				}
				Swap.swap(ar, largestIndex, i);
			}
		}

		System.out.println(Arrays.toString(ar));
	}

}