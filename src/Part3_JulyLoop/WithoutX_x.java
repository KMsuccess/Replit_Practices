package Part3_JulyLoop;
/*
Given a string word, if the first or last chars are 'x' or 'X',
print the string without those 'x' or 'X' chars,  otherwise print the string unchanged.

Example:
input: xHiX
output: Hi

Example:
input: apple
output: apple

input: xUxL
output: UxL

input: JavaX
output: Java
 */
import java.util.Scanner;

public class WithoutX_x {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        String firstIndex = word.charAt(0)+"";
        String lastIndex = word.charAt(word.length()-1)+"";


        if(firstIndex.equalsIgnoreCase("x") && lastIndex.equalsIgnoreCase("x")){
            System.out.println(word.substring(1,word.length()-1));
        }
        else if(lastIndex.equalsIgnoreCase("x") ){
            System.out.println(word.substring(0,word.length()-1));
        }
        else if(firstIndex.equalsIgnoreCase("x")) {
            System.out.println(word.substring(1));
        }else{
            System.out.println(word);
        }


    }
}
