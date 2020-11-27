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

	public static Float max(Float first, Float second, Float third) {
		Float max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		return max;
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3 };
		Float[] floatArray = { 1.224f, 3.364f, 4.365f };
		System.out.println("max integer--" + max(intArray[0], intArray[1], intArray[2]));
		System.out.println("max float--" + max(floatArray[0], floatArray[1], floatArray[2]));
	}

}