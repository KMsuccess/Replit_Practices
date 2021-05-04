package Part2_June;
/*
Write a program that will print out the longest word.
 */
import java.util.Scanner;

public class PrintTheLongestWord {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //WIRTE YOUR CODE HERE


        int w1 = word1.length();
        int w2 = word2.length();
        String theLongest = (w1>w2)?  word1: (w1<w2)? word2 : "word1 and word2 are equal";
        System.out.println(theLongest);
    }
}
