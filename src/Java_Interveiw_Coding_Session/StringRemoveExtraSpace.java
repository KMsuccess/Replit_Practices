package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class StringRemoveExtraSpace {
    /*
    27. Remove All Extra Space from String
Input: “ Hello world I love Java ”
Output: Hello world I love Java
     */

    public static String removeExtraSpace(String sentence){
        String[] words = sentence.trim().split(" ");
        String result = "";
        for (String each : words) {
            if(!each.isEmpty())
                result += each + " ";
        }
        return result.trim();
    }
//======================================================
    public static void main(String[] args) {
        System.out.println(removeExtraSpace("String sentence"));
    }
}
