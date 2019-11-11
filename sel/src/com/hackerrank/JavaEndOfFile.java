package com.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaEndOfFile {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

        List<String> l = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc = new Scanner(System.in);
        for (int i=0; i <n; i++) {
            l.add(sc.nextLine());
        }
        for (int i=0; i < l.size(); i++) {
            System.out.println((i+1) + " " + l.get(i));
        }
        sc.close();
    }

}
