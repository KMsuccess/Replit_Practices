package Part2_June;
/*
using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.

use print not println.

 */
import java.util.Scanner;

public class stringCharAt {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        char l3 = txt.charAt(2);
        System.out.println(l3);

        char l5 = txt.charAt(4);
        System.out.println(l5);

        char l6 = txt.charAt(4+1);
        System.out.println(l6);





    }
}
