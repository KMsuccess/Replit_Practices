package Part4_julyArraysLoop;
/*
The code provided in your main method will take in eight Strings and save them into an array called arr.
Print out the 4 lines using for loop:
each line should contain a pair of array element as displayed below
user for loop

Example:
arr -> ["apple", "banana","kiwi", "grape","milk", "soda","juice", "coffee"]
 prints:  apple , banana
          kiwi , grape
          milk, "soda"
          juice, coffee
 */
import java.util.Scanner;

public class ArraysPrinting02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[8];
        for (int i=0;i<2;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 8 items
        //and print two items at a time in 4 line
        //write your code below

        System.out.println(arr[0] +" , " + arr[1]);
        System.out.println(arr[2] +" , " + arr[3]);
        System.out.println(arr[4] +", " + arr[5]);
        System.out.println(arr[6] +", " + arr[7]);





    }
}
