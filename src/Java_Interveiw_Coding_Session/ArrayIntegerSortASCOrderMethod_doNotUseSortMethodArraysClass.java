package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class ArrayIntegerSortASCOrderMethod_doNotUseSortMethodArraysClass {

    /*
    49. Write a return method that can sort an int array in Ascending order
     without using the sort method of the Arrays class
     */

    public int[] sortingArrayAsc(int[] arr){
        int[] result = Arrays.copyOfRange(arr, 0, arr.length);

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (result[i] < result[j]) {
                    Integer temp = result[i];
                    result[i] = result[j];
                    result[j]= temp;
                }
            }
        }
        return result;
    }
}
