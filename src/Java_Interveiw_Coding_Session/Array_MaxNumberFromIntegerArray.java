package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class Array_MaxNumberFromIntegerArray {

    /*
    7. Write a method that can find the maximum number from an int Array
     */

   // Solution 1:
    public int maxValue( int[ ] n ) {
        int max = Integer.MIN_VALUE;
        for(int each: n){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

 //   Solution 2:
    public int maxValue1( int[ ] n ) {
        Arrays.sort( n );
        return n [ n.length-1 ];
    }
}
