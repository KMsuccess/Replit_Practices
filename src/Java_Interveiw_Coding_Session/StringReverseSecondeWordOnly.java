package Java_Interveiw_Coding_Session;

import java.util.Arrays;

public class StringReverseSecondeWordOnly {
    /*
    28. Reverse the second word ONLY
    Ex:
Input: I Love Java
OutPut: I evoL Java
     */

    public static String reverseSecondWord(String sentence){         //  i put static
        String[] words = sentence.split(" ");
        String reversed = "";
     //   System.out.println(words[1]);
        for(int i = words[1].length()-1; i >=0; i--) {  // takes 1 word (words[1]) after split words
            reversed += words[1].charAt(i);
        }
        words[1] = reversed;    // we are changing previous value of word[1]
     //   System.out.println(Arrays.toString(words));     [good, gninrom]
        String result = "";
        for (String each : words)
            result += each + " ";
        return result.trim();      // good gninrom
    }
//===============================================================
    public static void main(String[] args) {
        System.out.println(reverseSecondWord("good  morning"));   //good gninrom
    }
}
