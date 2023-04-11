package study.algorithms;

import java.util.Scanner;

public class AlgoTest {

	public static void main(String[] args) {

		System.out.println(FirstReverse("Test String"));

	}

	public static String FirstReverse(String str) {

		String newString = "";

		for (int i = str.length()-1; i>=0; i--) {
			newString += str.charAt(i);
		}

		return newString;
	}

}
