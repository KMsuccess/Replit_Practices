package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class ArraysSortSubarray {
    public static void main(String[] args) {

/*
How to Sort Subarray
An array derived from the array is known as subarray.
Suppose, a[] is an array having the elements [12, 90, 34, 2, 45, 3, 22, 18, 5, 78]
and we want to sort array elements from 34 to 18.
It will sort the subarray [34, 2, 45, 3, 22, 18] and keep the other elements as it is.

To sort the subarray, the Arrays class provides the static method named sort().
It sorts the specified range of the array into ascending order.
We can also sort the array of type long, double, float, char, byte, etc.

Syntax:

public static void sort(int[] a, int fromIndex, int toIndex)
The method parses the following three parameters:

a: An array to be sort.
fromIndex: The index of the first element of the subarray. It participates in the sorting.
toIndex: The index of the last element of the subarray. It does not participate in the sorting.
If formIndex is equal to the toIndex, the range to be sorted is empty.
It throws IllegalArgumentException if fomIndex is greater than toIndex.
It also throws ArrayIndexOutOfBoundsException if fromIndex < 0 or toIndex > a.length.

Let's sort a subarray through a Java program.

SortSubarrayExample.java
 */

        //defining an array
        int[] a = {12, 90, 34, 2, 45, 3, 22, 18, 5, 78};
// sorts subarray form index 2 to 7
        Arrays.sort(a, 2, 7);  // will be sorted from index 2 include to index 7 not include
//prints array using the for loop                //  (from index[2] to index[7]-1)
        for (int i = 0; i < a.length; i++)
        {
            System.out.println(a[i]);  //  12, 90, 2, 3, 22, 34, 45, 18, 5, 78
        }

    }
}
