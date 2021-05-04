package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class Array_MinNumberFromIntegerArray {
    /*
    8. Write a method that can find the maximum number from an int Array
     */

  //  Solution 1:
    public int maxValue( int[] n ) {
        int min = Integer.MAX_VALUE;
        for(int each: n){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

  //  Solution 2:
    public int maxValue1( int[] n ) {
        Arrays.sort( n );
        return n [ 0 ];
    }
}
