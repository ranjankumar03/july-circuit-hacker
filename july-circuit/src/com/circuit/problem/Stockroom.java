package com.circuit.problem;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Stockroom {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int numOfTestCases = scanner.nextInt();

		for (int i = 0; i < numOfTestCases; i++) {

			int numOfStudents = scanner.nextInt();
			Set<String> uniqueNumOfStudents = new HashSet<String>();
			for (int j = 0; j < numOfStudents; j++) {

				String studentName = scanner.next().toLowerCase();
				uniqueNumOfStudents.add(studentName.substring(0, 1));
				System.out.println(studentName.substring(0, 1));
			}
			
			if(numOfStudents > uniqueNumOfStudents.size())
				System.out.println("NO");
			else{
				System.out.println("YES");
			}
		}
	}
}
