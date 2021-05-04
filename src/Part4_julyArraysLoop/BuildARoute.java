package Part4_julyArraysLoop;
/*
Write a program that will print out route instructions. Your program should take 2 parameters:
start point and endpoint. Use left, right, up and down for navigation.
Insert ">" between commands.
If start point equals to endpoint - display: "start/end(start or end variable!) found".
Note: you may move only clockwise.

Example:
Input: A
Input: D
Output: right > down > left: D found

Input: C
Input: C
Output: C found
 */
import java.util.Scanner;

public class BuildARoute {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();


        switch (start) {

            case "A":
                if (end.equals("A")) {
                    System.out.println("A found");
                } else if (end.equals("B")) {
                    System.out.println("right: B found");
                } else if (end.equals("C")) {
                    System.out.println("right > down: C found");
                } else if (end.equals("D")) {
                    System.out.println("right > down > left: D found");
                }
                break;
            case "B":
                if (end.equals("A")) {
                    System.out.println("down > left > up: A found");
                } else if (end.equals("B")) {
                    System.out.println("B found");
                } else if (end.equals("C")) {
                    System.out.println("down: C found");
                } else if (end.equals("D")) {
                    System.out.println("down > left: D found");
                }
                break;
            case "C":
                if (end.equals("A")) {
                    System.out.println("left > up: A found");
                } else if (end.equals("B")) {
                    System.out.println("left > up > right: B found");
                } else if (end.equals("C")) {
                    System.out.println("C found");
                } else if (end.equals("D")) {
                    System.out.println("left: D found");
                }
                break;
            case "D":
                if (end.equals("A")) {
                    System.out.println("up: A found");
                } else if (end.equals("B")) {
                    System.out.println("up > right: B found");
                } else if (end.equals("C")) {
                    System.out.println("up > right > down: C found");
                } else if (end.equals("D")) {
                    System.out.println("D found");
                }
                break;

        }

    }
}
