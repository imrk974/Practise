package com.hackerrank;

import java.util.Scanner;

public class PlusMinus {

	// Complete the plusMinus function below.
	static void plusMinus(int[] arr) {
		int zeroCount = 0, posCount = 0, negCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount = zeroCount + 1;
			} else if (arr[i] > 0) {
				posCount = posCount + 1;
			} else {
				negCount = negCount + 1;
			}
		}
		double zeroPercent = zeroCount/arr.length;
		double posPercent = posCount/arr.length;
		double negPercent = negCount / arr.length;

		System.out.println(posPercent);
		System.out.println(negPercent);
		System.out.println(zeroPercent);

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the size");
	//	int n = scanner.nextInt();
	//	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] arr = new int[6];

		String[] arrItems = {"-4","3", "-9", "0","4" ,"1"};
//		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < 6; i++) {
			int arrItem = Integer.parseInt(arrItems[i]);
			arr[i] = arrItem;
		}

		plusMinus(arr);

		scanner.close();
	}
}
