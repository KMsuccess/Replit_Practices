package Part3_JulyLoop;
import java.util.Scanner;
/*
Write a program that will print out first and last letters together.

adobe
ae
 */
public class PrintFirstAndLastLetters {
    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);


        System.out.println(""+first+last);

    }
}
