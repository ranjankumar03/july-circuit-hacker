package com.circuit.problem;

import java.util.Arrays;

public class ThirstyCrowProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] input1 = { 5, 58 };
		int[] input1 = { 2,5,11,13,15 };
		int input2 = 5;
		int input3 = 3;

		System.out.println(ThirstyCrowProblem1(input1, input2, input3));
	}

	private static int ThirstyCrowProblem1(int[] input1, int input2,
			int input3) {

		Arrays.sort(input1);

		int range = Math.abs(input2 - input3) + 1;
		int partA = 0;
		for (int i = 0; i < input3 - 1; i++) 
			partA+=input1[i];
		
		int partB = range*input1[input3-1];
		System.out.println("partB->"+partB);
		return (partA+partB);
	}

}
