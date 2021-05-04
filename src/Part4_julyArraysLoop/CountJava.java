package Part4_julyArraysLoop;
/*
Return the number of times that the string "java" appears anywhere in the given string word.

Example:
input: javaxjava
output: 2

Example:
input: javaxjavaapplepearjavaegg
output: 3
 */
import java.util.Scanner;

public class CountJava {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String word = scan.next();

        String jav ="java";
        int num =0;

        for(int i=0;i<=word.length()-4;i++){
            String check = word.substring(i,i+4);
            if(check.equals(jav)){
                num +=1;
            }

        }

        System.out.println(num);


    }
}
