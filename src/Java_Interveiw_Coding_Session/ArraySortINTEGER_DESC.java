package Java_Interveiw_Coding_Session;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortINTEGER_DESC {
    public static void main(String[] args) {

        /*
        Sorts an array in the descending order.

 We have defined an array as Integer.
Because the reverseOrder() method does not work for the primitive data type.
         */

        Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
// sorts array[] in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(array));

    }
}
