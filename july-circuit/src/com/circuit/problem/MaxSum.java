package com.circuit.problem;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSum {

	public static void main(String[] args) {

		// int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		Scanner scanner = new Scanner(System.in);
		int numberOfTestCase = scanner.nextInt();

		for (int i = 0; i < numberOfTestCase; i++) {
			int totalElements = scanner.nextInt();
			int[] array = new int[totalElements];
			for (int j = 0; j < totalElements; j++) {
				array[j] = scanner.nextInt();
			}
			System.out.println(maxContiguousSum(array) +" "+maxNonContiguousSum(array));
		}
	}

	private static int maxContiguousSum(int[] array) {

		int max = array[0];
		int[] sum = new int[array.length];
		sum[0] = array[0];
		if(array.length == 1)
			return array[0];
		for (int i = 1; i < array.length; i++) {

			sum[i] = Math.max(array[i], sum[i - 1] + array[i]);
			max = Math.max(sum[i], max);
		}
		return max;
	}

	private static int maxNonContiguousSum(int[] array) {
		int sum = 0;
		boolean ifAllNegatives = true;
		for(int i=0;i<array.length;i++){
			if(array[i] > 0){
				ifAllNegatives = false;
			}
		}
			
		if(ifAllNegatives){
			Arrays.sort(array);
			return array[array.length-1];
		}
		if(array.length == 1)
			return array[0];
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= 0)
				sum += array[i];
		}
		return sum;
	}
}
