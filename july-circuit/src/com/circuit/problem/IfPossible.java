package com.circuit.problem;

public class IfPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 1;
		int b = 2;
		int c = 3;
		int d = 6;
		System.out.println(ifPossible(a, b, c, d));

	}

	private static String ifPossible(int a, int b, int c, int d) {
	
		while (true) {
			if (a < c) {
				a += b;
				if (a == c && b == d)
					return "Yes";
			} else if (b < d) {
				b += a;
				if (a == c && b == d)
					return "Yes";
			} else {
				return "No";
			}
		}
	}
}
