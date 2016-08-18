package com.circuit.problem;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = { 1, 2, 3, 4, 2, 6, 7, 5, 5 };

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (Integer number : numbers) {
			if (map.containsKey(number)) {
				map.put(number, map.get(number) + 1);
			} else {
				map.put(number, 1);
			}
		}

		int duplicateCount = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				duplicateCount++;
			}
		}
		
		
		System.out.println(duplicateCount);
	}
}
