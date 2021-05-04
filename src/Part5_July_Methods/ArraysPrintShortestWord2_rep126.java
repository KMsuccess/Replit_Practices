package Part5_July_Methods;

import java.util.*;
/*
Write a program that will find out shortest words in the given string str.
If there are few words that are evenly short, print them all.
Use split method in order to split str string variable and create an array of strings.
Print array with Arrays.toString() method. Sort array before printing.
Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
 */

public class ArraysPrintShortestWord2_rep126 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String [] words = str.split(", ");

        String shortestWord = words[0];

        for(String currentWord: words){
            if(currentWord.length()<shortestWord.length()){
                shortestWord = currentWord;

                // volt, olive, fish, hot pursuit, warning, python, java, coffee, part

               // System.out.println(shortestWord);  // vybiraet tolko volt!!!

                // a etu schitaet normalno: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray

                // esli volt postavit v konec, to rabotaet, znachit vybiraet pervoe korotkoe slovo i vyhodit iz loop
            }
        }

        String allShortest = "";
        for(String currentWord: words) {

            if(currentWord.length() == shortestWord.length()){
                allShortest += currentWord + ",";
            }
        }
        allShortest = allShortest.substring(0,allShortest.length()-1);  // eta strochka ne nugna

        String [] shortestWordArray = allShortest.split(",");

        Arrays.sort(shortestWordArray);
        System.out.println(Arrays.toString(shortestWordArray));

    }
}
