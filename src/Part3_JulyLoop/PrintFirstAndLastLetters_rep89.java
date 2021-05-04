package Part3_JulyLoop;
import java.util.Scanner;
/*
Write a program that will print out first and last letters together.

adobe
ae
 */
public class PrintFirstAndLastLetters_rep89 {
    public static void main(String[] args) {

        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(""+word.charAt(0)+word.charAt(word.length()-1));

    }
}
