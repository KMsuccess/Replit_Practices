package Java_Interveiw_Coding_Session;

public class String_reversString {
    /*
    4. Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static String StrReverse(String str) {   // i made this method static
        String reverse="";
        for(int i=str.length()-1; i >= 0; i--)
            reverse += str.toCharArray()[i];
        return reverse;
    }

    //=======================================================================
    public static void main(String[] args) {
        System.out.println(StrReverse("ABCDEFG"));

    }
}
