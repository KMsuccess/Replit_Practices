package Java_Interveiw_Coding_Session;

import java.util.Arrays;
import java.util.Collections;

public class ArraysSortString_DESC_Order {
/*
 Sorts array elements in alphabetical order. DESC   // Collections.reverseOrder()
 */
    public static void main(String[] args) {

        String [] strarray = {"Mango", "Apple", "Grapes", "Papaya", "Pineapple", "Banana", "Orange"};
// sorts array[] in descending order
        Arrays.sort(strarray, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " +Arrays.toString(strarray));
    }
}
