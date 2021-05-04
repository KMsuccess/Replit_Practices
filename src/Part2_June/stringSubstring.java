package Part2_June;
/*
using substring method output the first two letters of txt string
for example:
String txt = "foo"
the first two letters are "fo"

use print not println.

 */
import java.util.Scanner;

public class stringSubstring {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

       String num2 = txt.substring(0,2);
        System.out.println(num2);

    }
}
