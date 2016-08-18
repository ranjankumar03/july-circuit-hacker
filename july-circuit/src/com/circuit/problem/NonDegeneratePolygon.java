package com.circuit.problem;

import java.util.Scanner;

public class NonDegeneratePolygon {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numOfSides = scanner.nextInt();
		int[] sideLeggthArray = new int[numOfSides];

		int sum = 0;
		for (int i = 0; i < numOfSides; i++) {
			sideLeggthArray[i] = scanner.nextInt();
			sum += sideLeggthArray[i];
		}

		int numOfCutsRequired = 0;
		for (int i = 0; i < numOfSides; i++) {
			if (sideLeggthArray[i] >= sum / 2) {
				numOfCutsRequired++;
				if (sideLeggthArray[i] / 2 >= sum / 2)
					numOfCutsRequired++;
			}

		}
		System.out.println(numOfCutsRequired);
	}
}
