package Part2_June;

import java.util.Scanner;
/*
Write a program that will print out first half of the word twice.

Example:

input: java
output: jaja
 */
public class jaja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        String word1 = word.substring(0,word.length()/2);
        System.out.println(word1+word1);


    }
}