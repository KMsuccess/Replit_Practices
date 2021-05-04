package Part6_August;
import java.util.*;
/*
uniqueChars is a method that you will code now, should be able to accept any string in the world
and return unique characters from the parameter.

Examples:

uniqueChars("java") ==> "jav"

uniqueChars("mama") ==> "ma"

uniqueChars("spoon") ==> "spon"

 */
public class MethodsWithString2_RemoveDuplicates_rep179 {

    public static void main(String[] args) {
        //test your code
        System.out.println(uniqueChars("wooden-spoon"));
    }

    public static String uniqueChars(String str) {
        //TODO: write your below

        String unique = "";

        for (int i = 0; i < str.length(); i++) {

            String currentChar = str.substring(i, i + 1);
            if (!unique.contains(currentChar)) {
                unique += currentChar;

            }
        }
        return unique;
    }
}



