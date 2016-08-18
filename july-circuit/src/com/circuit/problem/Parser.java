package com.circuit.problem;

import java.util.Scanner;
import java.util.Stack;

public class Parser {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.next();
		System.out.println(checkParanthesisisBalanced(inputString));
	}

	private static boolean checkParanthesisisBalanced(String inputString) {

		Stack<Character> stack = new Stack<Character>();

		for (char ch : inputString.toCharArray()) {
			if (ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} 
			else if (ch == ')' || ch == '}' || ch == ']') {
				stack.pop();
			}
		}
		if (stack.size() == 0)
			return true;
		return false;
	}
}
