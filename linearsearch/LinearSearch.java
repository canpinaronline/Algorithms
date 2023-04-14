package linearsearch;

public class LinearSearch {

    public void linearSearch(int searchvalue) {
        /* Declaring */
        int [] myArray = new int[10];

        /* Generate random array*/
        for(int i = 0; i<myArray.length;i++) {
            myArray[i] = (int) (Math.random() * 10);
        }

        /* Print current array. */
        System.out.println("Current array: ");
        for(int element : myArray) {
            System.out.print(element + " - ");
        }

        /* Linear Search */
        boolean valueInArray = false;
        String indexWithValue = "";
        System.out.println();
        System.out.print("Value was found in the following indexes: ");
        for(int j = 0; j < myArray.length; j++) {
            if(myArray[j] == searchvalue) {
                valueInArray = true;
                System.out.print(j + " ");
                indexWithValue += j + " ";
            }
        }

        if(!valueInArray) {
            indexWithValue = "Nothing matches. ";
            System.out.print(indexWithValue);
        }
    }
}
