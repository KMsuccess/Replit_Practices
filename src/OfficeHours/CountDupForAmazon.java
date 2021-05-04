package OfficeHours;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
[ Amazon 1st round question]

* Write a program to identify the frequency of duplicates words in a string.
Print duplicates words and their frequency.

 */
public class CountDupForAmazon {

    public static void main(String[] args) {
        countDups("java is java language is useful java");
    }

    public  static void countDups(String  s){

        ArrayList<String> words = new ArrayList<>(Arrays.asList(s.split(" ")));
        // converted String to ArrayList of String

        String checked = "";
        for(String eachWord : words){
            if(!checked.contains(eachWord)){
                int freqOfEachWord = Collections.frequency(words,eachWord);  // Ready method

                System.out.println(eachWord + ": " + freqOfEachWord);
                checked += eachWord + " ";
            }

        }

     }



}
