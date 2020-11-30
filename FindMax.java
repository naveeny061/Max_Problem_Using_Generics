package com.maximum;

import java.util.Arrays;

public class FindMax<T extends Comparable<T>> {
	private T first, second, third, fourth;

	public FindMax(T first, T second, T third, T fourth) {
		this.first = first;
		this.second = second;
		this.third = third;
		this.fourth = fourth;
	}

	public FindMax() {
		// TODO Auto-generated constructor stub
	}

	public T Max() {
		return FindMax.Maximum(first, second, third, fourth);
	}

	public static <T extends Comparable<T>> T Maximum(T first, T second, T third, T fourth) {
		T max = first;
		if (second.compareTo(max) > 0)
			max = second;
		if (third.compareTo(max) > 0)
			max = third;
		if (fourth.compareTo(max) > 0)
			max = fourth;
		printMax(first, second, third, fourth, max);
		return max;
	}

	public static <T> void printMax(T first, T second, T third, T fourth, T max) {
		System.out.printf("Max of %s, %s, %s and %s is %s\n", first, second, third, fourth, max);
	}

	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4 };
		Float[] floatArray = { 1.224f, 3.364f, 4.365f, 2.134f };
		String[] stringArray = { "Apples", "Peach", "Bannana", "Orange" };

		new FindMax<Integer>(intArray[0], intArray[1], intArray[2], intArray[3]).Max();
		new FindMax<Float>(floatArray[0], floatArray[1], floatArray[2], floatArray[3]).Max();
		new FindMax<String>(stringArray[0], stringArray[1], stringArray[2], stringArray[3]).Max();
	}

}