package com.circuit.problem;

import java.util.Arrays;

public class TotalSum {

	public static void main(String[] args) {

		int[] a = { 6,6,3,9,3,5,1 };
		Arrays.sort(a);
		// 1 3 3 5 6 6 9

		long k = 12;

		System.out.println(printPairs(a, k));

	}

	private static int printPairs(int[] a, long k) {

		int count = 0;
		int prevX = -1 ;
		int prevY = -1;
		for (int i = 0; i < a.length; i++) {
			int first = a[i];
			for (int j = i + 1; j < a.length; j++) {
				int second = a[j];
				
				if ((first + second) == k && (prevX != second && prevY != first)) {
					System.out.printf("(%d, %d) %n", first, second);
					prevX = first;
					prevY=second;
					count++;
				}
			}
		}
		return count;
	}
}
