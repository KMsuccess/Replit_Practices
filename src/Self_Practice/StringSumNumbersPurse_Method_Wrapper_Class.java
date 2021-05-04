package Self_Practice;

/*
Given a String with numbers and letters. Output the sum of
all numbers in given String.
For example:
 Input:
String str = "jav34ajs4jk60";
Output:
44 (34 + 4 + 6 = 44)
 */
public class StringSumNumbersPurse_Method_Wrapper_Class {

    public static void main(String[] args) {

        String str = "jav34ajs4jk60";

        int total = 0;

        char[] ch =  str.toCharArray();

        for(char each: ch) {

            if (Character.isDigit(each)) {

                total += Integer.valueOf("" + each);//        result sum of each  total = 3+4+4+6+0=17

/*
        char [] ch = str.toCharArray();
          int  result = 0;
        for(char each : ch){
            if(each >= 48 && each <= 57){

                result +=each;
            }
        }
        System.out.println(result);
*/

            }
        }
        System.out.println(total);
    }

}


