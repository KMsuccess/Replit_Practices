package Part3_JulyLoop;
/*
The code provided in your main method will take in five Strings and save them into an array called arr.
 Print out the first three letters of each element of arr, one per line.
  You can assume that every element of arr is at least 3 letters long.

Example:
arr -> ["apple", "banana"]
 prints: app
         ban
Hint: How do you get the first 3 letters of any String starting from index 0 till right before index 3?
 */
import java.util.Scanner;

public class ArraysPrinting01 {
    public static void main(String[] args) {


                /*
 String[] words = {"Apple", "Banana", "Strawberry", "Java", "Python"};


        System.out.println( words[0].substring(0, 3) );
        System.out.println( words[1].substring(0, 3) );
        System.out.println( words[2].substring(0, 3) );
        System.out.println( words[3].substring(0, 3) );


        for(int i =0; i <= words.length-1; i++){ // i: 0, 1, 2, 3, 4
            System.out.print( words[i].substring(0, 3) );
        }
        System.out.println();
        System.out.println("===================================================");

        for(String each: words){
            System.out.print(each.substring(0,3));
                 */

        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        //leave above alone! :)
        //assume you have String array of 5 items

        //write your code below:

        for(String each:arr){
            System.out.println(each.substring(0,3));
        }

    }
}
