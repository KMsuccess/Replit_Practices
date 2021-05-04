package Part3_JulyLoop;
import java.util.Scanner;
/*
Write a program that will print out information about user based on email.
Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
 */
public class Email2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();


        String firstW = email.substring(0,email.indexOf('_'));
        String secondW = email.substring(email.indexOf('_')+1,email.indexOf('@'));

        String domain = email.substring(email.indexOf('@')+1,email.indexOf('.'));
         String topLevelDomain = email.substring(email.indexOf('.')+1);


        System.out.println("First name: " +firstW.toUpperCase().charAt(0)+firstW.substring(1));
        System.out.println("Last name: " +secondW.toUpperCase().charAt(0)+ secondW.substring(1));

       System.out.println("Domain: "+domain);
         System.out.println("Top-Level Domain: "+topLevelDomain);



    }
}
