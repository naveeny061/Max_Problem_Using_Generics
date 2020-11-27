package com.maximum;

import java.util.Scanner;

public class FindMax {
	public static Integer max(Integer first, Integer second, Integer third) {
		Integer max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Integer[] intArray = new Integer[3];
		System.out.println("Enter first number");
		intArray[0] = scanner.nextInt();
		System.out.println("Enter second number");
		intArray[1] = scanner.nextInt();
		System.out.println("Enter third number");
		intArray[2] = scanner.nextInt();
		System.out.println(max(intArray[0], intArray[1], intArray[2]));
	}

}