package Part3_JulyLoop;
import java.util.*;
/*
You have a word, do the following:

If the word has odd number of characters
and has 5 or more characters, print the middle three
characters of the word.

Otherwise print "invalid".

fifteen ==> fte
apple ==> ppl
hey ==> invalid
java ==> invalid
whatsup ==> ats
$ ==> invalid
 */

public class MiddleThree {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        boolean odd = word.length()>=5 && word.length()%2 !=0;

        if(odd ){

            System.out.println(word.charAt(((word.length()-1)/2)-1) + "" +word.charAt(word.length()/2)+
                    word.charAt((word.length()/2)+1));

        }else{
            System.out.println("invalid");
        }
    }
}
