package com.hackerrank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiffofDiagonalMatrix {

	public static int diagonalDifference(List<List<Integer>> arr) {
		int sumoffirstDiagonal = 0;
		int sumofsecondDiagonal = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.get(i).size(); j++) {
				if (i == j) {
					sumoffirstDiagonal += arr.get(i).get(j);
				}
				if (i == (arr.size() - j - 1)) {
					sumofsecondDiagonal += arr.get(i).get(j);
				}
			}

		}
		return Math.abs(sumofsecondDiagonal - sumoffirstDiagonal);
	}

	public static void main(String[] args) throws IOException {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Matrix:\n");
		int n = sc.nextInt();

		List<List<Integer>> arr = new ArrayList<>();
		System.out.println("Enter elements of Matrix:\n");
		for (int i = 0; i < n; i++) {

			List<Integer> arrRowItems = new ArrayList<>();

			for (int j = 0; j < n; j++) {
				int arrItem = sc.nextInt();
				arrRowItems.add(arrItem);
			}

			arr.add(arrRowItems);
		}

		System.out.println(arr);
		int result = diagonalDifference(arr);
		System.out.println(result);

	}

}
