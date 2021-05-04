package Part5_July_Methods;

import java.util.Scanner;

/*
Given a string, print out true if the number of appearances of "java" anywhere in the string is equal
 to the number of appearances of "python" anywhere in the string (case sensitive).
Example:
input: We study java not python
output: true

Example:
input: What's the difference between java, javascript and python?
output: false
 */
public class EqualsJavaPython_rep101 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        int countP=0;
        int countJ=0;

        for( int i =0; i <= sentence.length()-4; i++) {
            if (sentence.substring(i, i + 4).equals("java")) {
                countJ++;
            }
        }
        for( int k =0; k <= sentence.length()-6; k++){

            if(sentence.substring(k, k + 6).equals("python")) {
                countP++;
            }
        }
        System.out.println(countJ==countP);


    }
}
