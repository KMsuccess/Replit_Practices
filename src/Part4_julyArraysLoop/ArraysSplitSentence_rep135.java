package Part4_julyArraysLoop;

import java.util.*;

/*
Given a String variable sentence, write code to type each word in separate lines.

Example:
sentence -> "Java is fun"
Print
Java
is
fun
 */
public class ArraysSplitSentence_rep135 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below

     String [] words = sentence.split(" ");
     for (String eachWord : words){
         System.out.println(eachWord);

     }






    }
}
