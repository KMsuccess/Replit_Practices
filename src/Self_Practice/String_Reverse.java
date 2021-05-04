package Self_Practice;

// Write a return method that can reverse  String

//Ex: Reverse("ABCD"); ==> DCBA

public class String_Reverse {


    // Solution 1

    public static String StrReverse(String str) {

        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--)

            reverse += str.toCharArray()[i];


        return reverse;

    }


    // Solution 2

    public static String Reverse(String str) {

        return new StringBuffer(str).reverse().toString();

    }

    // Solution 3
    public static void main(String[] args) {


       String str1 = "zidan";

       String result1 = "";

            for(int i = str1.length()-1; i >=0; i--){
                result1 +=str1.charAt(i);
              }
        System.out.println( result1);

//----------------------------------------------------- call    StrReverse("abc") method
        System.out.println(StrReverse("abc"));

        //----------------------------------------------------- call Reverse("ABCDEFG") method

        System.out.println( Reverse("ABCDEFG"));

    }

}
