package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class ArrayIntegerRemoveDuplicates {

    /*
    51. Write a function that can remove the duplicates from an array of
    integers
     */
    public int[] removeDuplicates(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }
}
