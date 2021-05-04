package Part2_June;

import java.util.Scanner;

/*
Write a program that will reverse a string. Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!". If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.

Example:
input: cat
output: Too short!

Example:
input: singularity
output: Too long!

Example:
input: apple
output: elppa

 */
public class jj {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        if (word.length() == 5) {
            char w1 = word.charAt(4);
            char w2 = word.charAt(3);
            char w3 = word.charAt(2);
            char w4 = word.charAt(1);
            char w5 = word.charAt(0);
            String W = w1 + "" + w2 + w3 + w4 + w5;
            System.out.println(W);

        }else if (word.length() > 5) {
                System.out.println("Too long!");
        } else  {
                System.out.println("Too short!");



        }
    }
}

