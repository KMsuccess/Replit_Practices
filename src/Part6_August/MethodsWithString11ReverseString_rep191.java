package Part6_August;

/*
reverse method reverse a string.
it gets a string and returns it in reverse.

for example:

reverse("foo") ==> "oof"

reverse("student") ==> "tneduts"


 */
public class MethodsWithString11ReverseString_rep191 {
    public static String reverse(String input)
    {
      String result = "";

      for(int i = input.length()-1; i >=0; i--){
          result += input.charAt(i);
      }
      return result;
    }
}


