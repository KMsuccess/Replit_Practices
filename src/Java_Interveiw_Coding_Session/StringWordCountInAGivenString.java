package Java_Interveiw_Coding_Session;

public class StringWordCountInAGivenString {
    /*
    30. return the word count in a given String
     */

    public static int countWords(String s) {
 /*
 Please implement this method to
 return the word count in a given String.
 Assume that the parameter String can only contain spaces and
alphanumeric characters.
 */
        return s.split(" ").length;
    }

    //========================================================

    public static void main(String[] args) {
        System.out.println(countWords("Hello Hello"));    //  2
    }
}
