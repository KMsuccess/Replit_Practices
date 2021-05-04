package Part4_julyArraysLoop;

import javafx.scene.transform.Scale;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Given an int array of any length, print a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.

Example:
input 1, 2, 3
output: [1, 2]

Example:
input 1,
output: [1]
 */
public class ArraysFrontPiece_rep139 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for(int i =0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int result[] = new int[2];


        if(num[size] >=2){
            result [0] = num[0];
            result [1] = num[1];

        }else{
            System.out.println(Arrays.toString(num));
        }



    }
}
/*
package Part1;

import java.util.Arrays;
import java.util.Scanner;

public class Array_FrontPiece {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < size; i++) {
            num[i] = scan.nextInt();
        }
        //WRITE YOUR CODE HERE

        int[] result = new int[2];

        if (num.length >= 2) {
            result[0] = num[0];
            result[1] = num[1];

        }

        System.out.println(Arrays.toString(num));


    }

}
 */