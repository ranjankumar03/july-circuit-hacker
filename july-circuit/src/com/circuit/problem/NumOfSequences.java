package com.circuit.problem;

import java.util.Scanner;

public class NumOfSequences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int modulo = (int) Math.pow(10, 7) + 7;
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int[] array1 = new int[num];
		int product = 1;
		for (int i = 0; i < num; i++) {
			array1[i] = scanner.nextInt();
			if(array1[i] == -1){
				product*=(i+1);
			}
		}
		System.out.println(product % modulo);
	}

}
