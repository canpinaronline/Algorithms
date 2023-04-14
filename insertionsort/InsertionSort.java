package insertionsort;

public class InsertionSort {

    public void insertionSort() {
        int[] myArray = new int[10];
        for(int i = 0;i < myArray.length;i++) {
            myArray[i] = (int) (Math.random() * 10);
        }
        System.out.println("Before sorting: ");
        for(int element: myArray) {
            System.out.print(element + " ");
        }

        /* First element already sorted by itself. Cause i starts at 1*/
        for(int i = 1;i<myArray.length;i++) {
            /* Each value that we look at take current value and copy it of to temporary variable. */
            int currentElement = myArray[i];
            /* j Reference to currentIndex-1 */
            int j = i - 1;
            while(j >= 0 && myArray[j] > currentElement) {
                /* Position changes  */
                myArray[j+1] = myArray[j];
                /* For keep moving towards the begining of the array. We just need to decrement J*/
                j--;
            }
            myArray[j+1] = currentElement;
        }

        System.out.println("\nAfter sorting: ");
        for(int element: myArray) {
            System.out.print(element + " ");
        }
    }
}
