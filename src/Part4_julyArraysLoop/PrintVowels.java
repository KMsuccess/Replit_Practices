package Part4_julyArraysLoop;
/*
Inputs:
String word;
Write a for loop that will loop through every letter of the input and print out just the vowels.
Sample input/outputs
In: howdyho
oo

In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
 */
import java.util.Scanner;

public class PrintVowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below


        for (int i = 0; i <= word.length() - 1; i++) {
            char vowels = word.charAt(i);
            String vowelsWord = vowels + "";

            if (vowels == ('a') || vowels == ('A') || vowels == ('e') || vowels == ('E') || vowels == ('i') ||
                    vowels == ('I') || vowels == ('o') || vowels == ('O') || vowels == ('u') || vowels == ('U')) {

                System.out.print(vowelsWord);


            }
        }
            System.out.println();
            System.out.println("===============================");    // another way


            for (int j = 0; j <= word.length() - 1; j++) {
                String vowels1 = word.charAt(j) + "";
                String vowelsWord1 = vowels1 + "";

                if (vowels1.contains("a") || vowels1.contains("A") || vowels1.contains("e") || vowels1.contains("E") || vowels1.contains("i") ||
                        vowels1.contains("I") || vowels1.contains("o") || vowels1.contains("O") || vowels1.contains("u") || vowels1.contains("U")) {

                    System.out.print(vowelsWord1);
                }
            }

    }
}









