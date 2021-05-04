package Part4_julyArraysLoop;
import java.util.Scanner;
/*
Print out the number of times that the string "hi" appears anywhere in the given string.
Example:
input: abc hi how hi
output: 2

Example:
input: hi code java please
output: 1
 */
public class CountHi_rep98 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count = 0;
        for(int i = 0; i<=str.length()-1; i++){
            if(str.toLowerCase().contains("hi")) {
                count++;
                str = str.toLowerCase().replaceFirst("hi", "");
            }
        }
        System.out.println(count);


/*
        for(int k =0; k<=str.length()-2;){
           if( str.substring(k,k+2).toLowerCase().contains("hi")){
               count++;
           }
        }
        System.out.println(count);
*/

    }
}
