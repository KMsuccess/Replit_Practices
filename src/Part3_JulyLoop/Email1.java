package Part3_JulyLoop;

import java.util.Scanner;
/*
In this task, you need to swap first name with last name in the email.
If email doesn't contains underscore - do not anything.

Example:
input: mike_tyson@gmail.com
output: tyson_mike@gmail.com

Example:
input: barakobama@gmail.com
output: barakobama@gmail.com

 */
public class Email1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if(email.contains("_")){


            int w2  = email.indexOf("_");
            int w3 = email.indexOf("_")+1;
            int w4 = email.indexOf("@");

            String word1 = email.substring(0,w2);
            String word2 = email.substring(w3,w4);
            String newWord = word2+"_"+word1 + email.substring(email.indexOf("@"));
            System.out.println(newWord + "");


        }else{
            System.out.println(email);

        }



    }
}
