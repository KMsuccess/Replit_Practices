package Part3_JulyLoop;
import java.util.*;
/*
In this exercise you get a string called txt .
output txt without its last letter.
for example:
txt = "foo"
output will be:
fo
 */
public class StringNoEnd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here


         String newWord = txt.substring(0,txt.length()-1);

        System.out.println(newWord );

    }
}
