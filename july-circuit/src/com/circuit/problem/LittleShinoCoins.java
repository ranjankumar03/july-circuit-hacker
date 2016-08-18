package com.circuit.problem;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LittleShinoCoins {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int K = scanner.nextInt();
		String coinsSequence = scanner.next();//abcaa
		char[] ch = coinsSequence.toCharArray();

		int numberOfPairs = 0;
		for (int i = 0; i < ch.length-K; i++) {
			for (int j = i + K; j <= ch.length; j++) {
				if (ifValid(i, j, K, coinsSequence)) {
					numberOfPairs++;
				}
			}
		}
		System.out.println(numberOfPairs);
	}

	private static boolean ifValid(int i, int j, int K, String coinsSequence) {

		Set<Character> set = new LinkedHashSet<Character>();
		for (Character ch1 : coinsSequence.substring(i, j).toCharArray()) {
			set.add(ch1);
		}
		if (set.size() == K)
			return true;
		return false;
	}
}
