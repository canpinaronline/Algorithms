import java.util.ArrayList;
import java.util.Scanner;

public class AlgoTest {

	public static void main(String[] args) {

		int[] array = new int[20];

		/* Create random numbers between (1-50) and assign to array. */
		for(int i = 0; i<array.length;i++) {
			array[i] = (int) (Math.random()*50) + 1;
		}

		/* Before sorting : Current array */
		System.out.println("\tBefore Sorting");
		for(int i=0;i<array.length;i++) {

			System.out.printf("%5d",array[i]);
		}

		System.out.println();
		System.out.println();

		/* Sorting Algorithm */
		int tempValue;
		for(int i =0;i<array.length-1;i++) {
			for(int j =0;j<array.length-1-i;j++) {
				if(array[j]>array[j+1]) {
					tempValue = array[j];
					array[j] = array[j+1];
					array[j+1] = tempValue;

				}
			}
		}

		/* After sorting : Result */
		System.out.println("\tAfter Sorting");
		for(int i=0;i<array.length;i++) {

			System.out.printf("%5d",array[i]);
		}

		

	}




}
