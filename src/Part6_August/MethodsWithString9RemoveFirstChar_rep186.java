package Part6_August;

/*
The method gets a string and returns a string minus the first string.

for example:

removeFirst("aaa")
returns "aa"

 */
public class MethodsWithString9RemoveFirstChar_rep186 {
    public static String removeFirst(String target) {

       //  target.substring(1);

         return target.replaceFirst(target.substring(0,1),""); // the same
    }
}
