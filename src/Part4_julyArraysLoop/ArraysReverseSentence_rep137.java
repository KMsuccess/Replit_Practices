package Part4_julyArraysLoop;
/*
Given a String variable sentence, write code to type each word in separate lines in a reverse order.
Example:
sentence -> "Java is fun"
Print
fun
is
Java
 */
import java.util.*;

public class ArraysReverseSentence_rep137 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TODO: Type your code below


        String [] words = sentence.split(" ");
        for (int i =words.length-1; i>=0; i--){


            System.out.println(words[i]);
        }



    }
}
