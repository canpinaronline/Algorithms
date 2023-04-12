import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlgoTest {

	public static void main(String[] args) {

		/* Defining array*/
		int[] myArray = new int[10];


		/* Generating an array with random values between (1-10)*/
		for(int i = 0; i<myArray.length;i++) {
			myArray[i] = (int) (Math.random()*10)+1;
		}

		/* Print current array*/
		for(int j = 0; j< myArray.length;j++) {
			System.out.printf("%3d",myArray[j]);
		}

			System.out.println();

			/* Find the biggest number in the array and its location. */
			findBiggestNumberAndItsLocation(myArray);


	}

	public static void findBiggestNumberAndItsLocation(int[] arr) {

		int biggestNumber = arr[0];
		int biggestNumberIndex = 0;

		for(int i = 0;i<arr.length;i++) {
			if(arr[i] > biggestNumber) {
				biggestNumber = arr[i];
				biggestNumberIndex = i;

			}
		}

		System.out.println("Biggest number is: " + biggestNumber + ", Stands on index " + biggestNumberIndex);
	}


}
