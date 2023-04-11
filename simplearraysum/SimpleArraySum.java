package simplearraysum;

public class SimpleArraySum {


    /*
    * Problem: Given an array of integers, find the sum of its elements.
    * Function Description
    *
    * It returns the sum of the array elements as an integer.
    * simpleArraySum has the following parameter(s):
    * arr: an array of integers
    *
    * Sample Input : [1,2,3,4,5,6,7,8,9]
    * Sample Output : 45
    *
     * */


    public int arraySum(int[] arr) {
        int arraySum = 0;
        for (int i = 0; i < arr.length; i++) {
            arraySum += arr[i];
        }
        return arraySum;
    }

}
