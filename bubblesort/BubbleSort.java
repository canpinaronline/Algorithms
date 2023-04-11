package bubblesort;

public class BubbleSort {

    public void bubbleSort() {
        int[] myArray = new int[20];

        /* Create random numbers between (1-50) and assign to myArray. */
        for(int i = 0; i<myArray.length;i++) {
            myArray[i] = (int) (Math.random()*50) + 1;
        }

        /* Before sorting : Current array */
        System.out.println("\tBefore Sorting");
        for(int i=0;i<myArray.length;i++) {

            System.out.printf("%5d",myArray[i]);
        }

        System.out.println();
        System.out.println();

        /* Sorting Algorithm */
        int tempValue;
        for(int i =0;i<myArray.length-1;i++) {
            for(int j =0;j<myArray.length-1-i;j++) {
                if(myArray[j]>myArray[j+1]) {
                    tempValue = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = tempValue;

                }
            }
        }

        /* After sorting : Result */
        System.out.println("\tAfter Sorting");
        for(int i=0;i<myArray.length;i++) {

            System.out.printf("%5d",myArray[i]);
        }

    }
}
