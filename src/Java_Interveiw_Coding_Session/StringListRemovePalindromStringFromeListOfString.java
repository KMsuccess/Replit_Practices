package Java_Interveiw_Coding_Session;

import java.util.Iterator;
import java.util.List;

public class StringListRemovePalindromStringFromeListOfString {

  /*
    36. remove palindrome strings from a List of String
    */
   // Solution 1: (If Lambda expression is allowed:                 ///???


    public List<String> removePalindromes(List<String> list){
        list.removeIf( p -> isPalindrome(p) );
        return list;                               ////??? i put return list; //??????
    }
    public static boolean isPalindrome(String str){
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt(i);
        }
        return reversed.equalsIgnoreCase(str);
    }

 //   Solution 2: (if Lambda expression is not allowed):
    public List<String> removePalindromes1(List<String> list){
        Iterator<String> it = list.iterator();

        while(it.hasNext()){
            String word = it.next();
            String reversed = "";
            for (int i = word.length()-1; i >= 0 ; i--) {
                reversed += word.charAt(i); }

            if(word.equalsIgnoreCase(reversed)){
                it.remove(); }
        }
        return list;
    }
}
