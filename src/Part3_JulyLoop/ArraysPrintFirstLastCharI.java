package Part3_JulyLoop;
/*
Given a String array words, iterate through each word and print first and last
letter of each element in separate lines.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
 */
import java.util.*;

public class ArraysPrintFirstLastCharI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print firt and last char of each items in one line

        //TODO: Write your code below

        for(int i=0; i<=words.length-1; i++){


            String each = words[i] ;
            char a = each.charAt(0);
            char b = each.charAt(each.length()-1);
            String newWord = ""+each.charAt(0)+each.charAt(each.length()-1);
            System.out.println(newWord);


        }

    }
}
