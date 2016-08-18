package com.circuit.problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {

	Integer[] numbersArray = new Integer[] { 1, 4, 5, 9, 10, 40, 50, 90, 100,
			400, 500, 900, 1000 };
	String[] romanArray = new String[] { "I", "IV", "V", "IX", "X", "XL", "L",
			"XC", "C", "CD", "D", "CM", "M" };

	public int binarySearch(int key) {

		int start = 0;
		int end = numbersArray.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key < numbersArray[mid]) {
				if (mid - 1 > -1) {
					if (key > numbersArray[mid - 1])
						return mid - 1;
					else {
						end = mid - 1;
					}
				} else {
					return mid;
				}
			} else {
				if (mid + 1 <= end) {
					if (key < numbersArray[mid + 1])
						return mid;
					else {
						start = mid + 1;
					}
				} else {
					return mid - 1;
				}
			}

		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(new Solution().calculateRomanEquivalent(233));
	}

	private String calculateRomanEquivalent(int num) {
		String romanValue = "";
		ArrayList<Integer> decimal = new ArrayList<Integer>(Arrays.asList(numbersArray));
		int index;
		while ((index = decimal.indexOf(num)) == -1) {
			index = binarySearch(num);
			if (index == -1) {
				return null;
			}
			romanValue = romanValue + romanArray[index];
			num = num - numbersArray[index];
		}
		romanValue = romanValue + romanArray[index];
		return romanValue;
	}

}
