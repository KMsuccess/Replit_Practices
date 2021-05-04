package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class IntegerNumberClosestToTheKey {

    /*
    29. Given sorted array, print the number that’s closest to the key
Ex:
Input: (1,3,5,9,11), 6
Output: 5
Input: (1,3,5,9,11), 10
Output: 9 , 11
     */

    public static void printTheClosestElement(int[] array, int key){
        int nearestSmaller = 0;
        int nearestLarger = 0;
        for (int each : array) {             //    works with already SORTED array!!!  in task
            if(each <= key)
                nearestSmaller = each;
            if(each > key)
                nearestLarger = each;
        }
        int differenceWithSmaller = key - nearestSmaller;
        int differenceWithLarger = nearestLarger - key;
        if(differenceWithSmaller > differenceWithLarger){
            System.out.println(nearestLarger);
        }else if(differenceWithLarger > differenceWithSmaller){
            System.out.println(nearestSmaller);
        }else{
            System.out.println(nearestLarger);
            System.out.println(nearestSmaller);
        }
    }
//================================================================
    public static void main(String[] args) {
       printTheClosestElement(new int[]{1,2,7,8,11,12},10);     //given SORTED array Task 1,2,3,4,5,6,7...

    }
}
