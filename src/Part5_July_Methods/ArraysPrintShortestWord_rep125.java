package Part5_July_Methods;
/*
Write a program that will print the shortest word in the given array str.

input: java, cable, red, vivid, remedy, grace
output: red
 */
import java.util.*;


public class ArraysPrintShortestWord_rep125 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String[] str = {scan.next(), scan.next(), scan.next(),
                scan.next(), scan.next(), scan.next()};

        String shortestWord = str[0];

        for (String each : str) {
            if(each.length() < shortestWord.length()){
                shortestWord = each;
            }

        }
        System.out.println(shortestWord);

    }
}
