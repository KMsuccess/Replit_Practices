package Part5_July_Methods;
/*
A sandwich is two pieces of bread with something in between.
Print the string that is between the first and last appearance of "bread" in the given string,
 or return string "nothing" if there are not two pieces of bread.

Example:
input: breadjambread
output: jam

Example:
input: xxbreadjambreadyy
output: jam

Example:
input: xxbreadapple
output: nothing

Example:
input: breadbutterbread
output: butter
 */
import java.util.Scanner;

public class GetSandwich_rep100 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();


       if( str.toLowerCase().contains("bread")){

           int firstIndex = str.indexOf("bread");
           int lastIndex = str.lastIndexOf("bread");

           if(firstIndex==lastIndex){
               System.out.println("nothing");
           }else{

               System.out.println(str.substring(firstIndex+5,lastIndex));

           }

       }else{
           System.out.println("nothing");
       }

    }
}
