package Part4_julyArraysLoop;
/*
Instructions from your teacher:
In this task, you need to slice an integer and print numbers one by one from new line.

Create a scanner object

Example # 1
-Display prompt: Enter your number:
12345
-Display prompt: 1
-Display prompt: 2
-Display prompt: 3
-Display prompt: 4
-Display prompt: 5

Example # 2

-Display prompt: Enter your number:
45678
-Display prompt: 4
-Display prompt: 5
-Display prompt: 6
-Display prompt: 7
-Display prompt: 8

Use / and % operators

 */
import java.util.Scanner;
import  java.util.Arrays;
public class SliceNumber {
    public static void main(String[] args) {
        //DO NOT CHANGE
        int num, digit1, digit2, digit3, digit4, digit5;
        //WRITE YOUR CODE HERE

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your number:");

        num = input.nextInt();

        digit1 = num / 10000;
        System.out.println(digit1);

        digit2 = (num % 10000) / 1000;
        System.out.println(digit2);

        digit3 = ((num % 10000) % 1000) / 100;
        System.out.println( digit3);

        digit4 = (((num % 10000) % 1000) % 100) / 10;
        System.out.println( digit4);

        digit5 = num % 10;
        System.out.println( digit5);



    }
}
