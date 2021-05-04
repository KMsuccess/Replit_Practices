package Part2_June;

/*
using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
 */


public class stringIndexOf {

    public static void main(String[] args) {

        String txt = "foo bar";
        //your code here


        int num1 = txt.indexOf('b');
        System.out.println(num1);

        int num2 = txt.indexOf("foo");
        System.out.println(num2);




    }
}
