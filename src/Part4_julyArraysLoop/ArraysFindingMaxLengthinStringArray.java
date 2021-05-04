package Part4_julyArraysLoop;
/*
Given the array words, it will print the word with the largest length.
 Assume that there are no 2 words with longest length

Example:
words -> ["aaa", "bbbbb", "whasstupppp", "longg" , "jaaaaavvaaaaaaaaaa"]
prints jaaaaavvaaaaaaaaaa
 */
import java.util.Scanner;

public class ArraysFindingMaxLengthinStringArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();
        }
        //write your code below

       /* int Max = 0;
        String maxWord = "";

        for(int j=0; j <=5; j++) {
            if (words[j].length() > Max) {
                Max = words[j].length();
                 maxWord = words[j];
            }
        }
        System.out.println(maxWord );

        */


        int maxLength = 0;
        String longestString = "";   // // or put  null   => ""

        for (String s : words) {
            if (s.length() > maxLength) {
                maxLength = s.length();
                longestString = s;

            }
        }
        System.out.println(longestString);
    }
}
