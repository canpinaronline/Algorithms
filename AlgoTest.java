package study.algorithms;

import java.util.Scanner;

public class AlgoTest {

	public static void main(String[] args) {
		
		System.out.println(FirstFactorial(5));

	}
	
	public static int FirstFactorial(int number) {
		int sum = 1;
		for(int i=1; i<number+1;i++) {
			sum = sum * i;
			
		}
		return sum;
	}

}
