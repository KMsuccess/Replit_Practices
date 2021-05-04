package Part4_julyArraysLoop;
/*
Given a string word, print true if "java" appears starting at index 0 or 1 in the string,
 such as with "javaxxx" or "xjavaxx" but not "xxjavaxx".
 The string may be any length, including 0word = .
Example:
input: javapython
output: true

Example:
input: cjavac++
output: true


Example:
input: c#javaruby
output: false
 */
import java.util.Scanner;

public class HasAJava_rep_093 {
    public static void main(String[] args) {
        boolean exists = false;
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.startsWith("java")){
            System.out.println(word.startsWith("java"));
        }
        if(word.substring(1).startsWith("java")){
            System.out.println(word.substring(1).startsWith("java"));
        }

           //   if(word.indexOf("java")==0 || word.indexOf("java")==1){

        System.out.println((word.indexOf("java")==0 || word.indexOf("java")==1));  // 1 choice

        System.out.println((word.startsWith("java") || word.indexOf("java")==1));    // 2 choice

        System.out.println((word.startsWith("java") || word.substring(1).startsWith("java")));   //   3choice



    }
}
