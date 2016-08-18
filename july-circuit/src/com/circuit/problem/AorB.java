package com.circuit.problem;

import java.math.BigInteger;
import java.util.Scanner;

public class AorB {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		int numberOfTestcases = scanner.nextInt();
		
		for(int j =0; j < numberOfTestcases; j++){
			int K = scanner.nextInt();
			
			String hexaA = scanner.next();
			BigInteger decimalA = new BigInteger(hexaA, 16);
			String hexToBinaryA = decimalA.toString(2);
			
			String hexaB = scanner.next();
			BigInteger decimalB = new BigInteger(hexaB, 16);
			String hexToBinaryB = decimalB.toString(2);
			
			String hexaC = scanner.next();
			BigInteger decimalC = new BigInteger(hexaC, 16);
			String hexToBinaryC = decimalC.toString(2);
			
			int maxLength = getMaxLength(hexToBinaryA, hexToBinaryB, hexToBinaryC);
			
			hexToBinaryA = doPadding(hexToBinaryA, maxLength);
			hexToBinaryB = doPadding(hexToBinaryB, maxLength);
			hexToBinaryC = doPadding(hexToBinaryC, maxLength);
			
			char[] characterA = hexToBinaryA.toCharArray();
			char[] characterB = hexToBinaryB.toCharArray();
			char[] characterC = hexToBinaryC.toCharArray();

			int change = 0;
			for (int i = 0; i < maxLength; i++) {

				if (characterC[i] == '0') {// both needs to be zero
					if (characterA[i] == '1' && characterB[i] == '1') {
						change += 2;
						characterA[i] = '0';
						characterB[i] = '0';
					} else if (characterA[i] == '1' && characterB[i] == '0') {
						change++;
						characterA[i] = '0';
					} else if (characterA[i] == '0' && characterB[i] == '1') {
						change++;
						characterB[i] = '0';
					}
				} else {
					if (characterA[i] == '0' && characterB[i] == '0') {
						change++;
						characterB[i] = '1';
					}
				}
			}
			
			if(change > K) {
				System.out.println("-1");
			}
			else
			{
				/*System.out.println(Integer.toHexString(Integer.parseInt(new String(characterA), 2)));*/
				System.out.println(new BigInteger(new String(characterA), 2).toString(16));
				//System.out.println(Integer.toHexString(Integer.parseInt(new String(characterB), 2)));
				/*BigInteger binaryStrB = new BigInteger(new String(characterB), 2);
				BigInteger hexaStrB = new BigInteger(binaryStrB.toString(), 16);
				System.out.println(hexaStrB);*/
				System.out.println(new BigInteger(new String(characterB), 2).toString(16));
			}
			
		}
	}

	private static int getMaxLength(String hexToBinaryA, String hexToBinaryB, String hexToBinaryC) {
		String maxLength = null;
		if (hexToBinaryA.length() > hexToBinaryB.length()) 
			maxLength = hexToBinaryA;
		else 
			maxLength = hexToBinaryB;

		if (maxLength.length() < hexToBinaryC.length())
			maxLength = hexToBinaryA;

		return maxLength.length();
	}

	public static String doPadding(String hexToBinaryA, int maxLength1) {

		int diffA = maxLength1 - hexToBinaryA.length();
		int countA = 0;
		while (countA < diffA) {
			hexToBinaryA = "0" + hexToBinaryA;
			countA++;
		}
		return hexToBinaryA;
	}
}
