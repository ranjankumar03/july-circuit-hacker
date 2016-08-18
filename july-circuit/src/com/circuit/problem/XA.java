package com.circuit.problem;

public class XA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String A ="aaab";
		String X ="bc";
		
		int index = A.indexOf(X);
		System.out.println("index-->>"+index);
		
		if(index != -1)
			System.out.println("present");
		else
			System.out.println("nope");

	}

}
