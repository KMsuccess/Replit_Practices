package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class IntegerAllZerosToTheEnd {

    /*
     34. write a program that can move all the zeros to the end of an array
     */


    public static int[] moveZerosToTheEnd(int[] array){      // i put this method static
        int[] result = new int[array.length];

        int count = 0;
        for (int each : array) {
            if(each != 0 )
                result[count++] = each;
        }
        return result;
    }
//===========================================================================================
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosToTheEnd(new int[]{1, 2, 0, 3, 4, 5, 0, 1}))); // [1, 2, 3, 4, 5, 1, 0, 0]
    }
}
