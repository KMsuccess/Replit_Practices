package Part5_July_Methods;
/*
Given a String array words, iterate through each word and print
first and last letter of each element in the format below.

Example:

words → ["hello", "why", "by", "apple" , "note"]
print → [ho, wy, by, ae, ne]

 */
import sun.security.util.Length;

import java.util.*;

public class ArraysPrintFirstLastCharII_rep140 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        //TODO: Write your code below

/*
        for (String each : words) {
            String str = "" + each.charAt(0) + each.charAt(each.length() - 1);
            System.out.println(str);
        }
 */

        for (int i = 0; i < words.length; i++) {
            words[i] = "" + words[i].charAt(0) + words[i].charAt(words[i].length() - 1);
        }
        System.out.print(Arrays.toString(words));

// tesla
//jiguli
//fiat
//jaguar
//kia

    }
}


