package Part6_August;

/*
the method gets two strings and return the longest one

biggerS("apple","orange") ==> "orange"
 */
public class MethodsWithString8BiggerString_rep185 {

    public static String biggerS(String a ,String b) {


      /*  String result = "";
       if(a.length()>b.length()){
           result = a;
       }else{
           result = b;
       }
       return result;
       */

        return (a.length()>b.length()? a:b);  // the same ternary

    }

}
