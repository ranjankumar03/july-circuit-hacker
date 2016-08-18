package com.circuit.problem;

import java.util.Arrays;
import java.util.Scanner;

public class MatchingSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();

		int[] array1 = new int[num];
		for (int i = 0; i < num; i++) {
			array1[i] = scanner.nextInt();
		}

		int[] array2 = new int[num];
		for (int i = 0; i < num; i++) {
			array2[i] = scanner.nextInt();
		}

		int forward = 0;
		int backward = num - 1;
		int count = 0;
		while (forward < backward) {
			if (array1[forward] == array2[forward])
				forward++;
			if (array1[backward] == array2[backward])
				backward--;

			while (!Arrays.equals(array1, array2) && array1[forward] < array2[forward] && array1[backward] > array2[backward]) {
				array1[forward] = array1[forward] + 1;
				array1[backward] = array1[backward] - 1;
				count++;
			}

			while (!Arrays.equals(array1, array2) && array1[forward] > array2[forward] && array1[backward] < array2[backward]) {
				array1[forward] = array1[forward] - 1;
				array1[backward] = array1[backward] + 1;
				count++;
			}
			if(array1[forward] != array2[forward] || array1[backward] != array2[backward]){
				 break;
			}
			forward++;
			backward--;

		}
		boolean bool = Arrays.equals(array1, array2);
		if(bool)
			System.out.println(count);
		else
			System.out.println("-1");
	}
}
