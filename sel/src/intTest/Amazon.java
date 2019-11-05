package intTest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Amazon {

	static String word = "Amazon_w_e_b_services are___widely__used_acc__ro___ss_the_worl_d";

	static StringBuffer sb = new StringBuffer();

	public static void recreateWord() {
		String[] ar = word.split(" ");
		ar[1].toString();
		for (int i = 0; i < ar.length; i++) {
			String temp = ar[i].replaceAll("_", "");
			sb.append(temp + " ");
		}
	}

	public static void main(String[] args) {
		// recreateWord();
		// System.out.println(sb);

		long[] abc = { 1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L };

		System.out.println(aVeryBigSum(abc));

	}

	static long aVeryBigSum(long[] ar) {
		int i = 0;
		long bigSum = 0;
		while (i < ar.length) {
			bigSum = bigSum + ar[i];

		}
		return bigSum;
	}

}
