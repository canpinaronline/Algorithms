package findbiggestnumberandlocation;

public class FindBiggestAndLocation {

    /*
     *
     *
     * Problem: Given an array of integers, find the biggest integer and its location.
     * Function Description
     *
     * It prints the biggest number of the array and its index.
     * FindBiggestAndLocation has the following parameter(s):
     * arr: an array of integers
     *
     * Sample Input : [4, 9, 8, 7, 7, 10, 3, 2, 4, 6]
     * Sample Output : "Biggest number is: 10, Stands on index 5"
     *
     * */

    public void findBiggestNumberAndItsLocation(int[] arr) {

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
