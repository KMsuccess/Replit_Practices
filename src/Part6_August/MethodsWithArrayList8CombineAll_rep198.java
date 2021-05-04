package Part6_August;

import Self_Practice.Array;

import java.util.ArrayList;

/*
Create a static method that:
is called combineAL
returns an ArrayList
takes two parameters: an ArrayList of Strings called wordList1, and an ArrayList of Strings called wordList2

This method should create a new ArrayList of Strings, add all the words (in order) from wordList1,
 then add all the words (in order) from wordList2.
 In other words, it is combining all the elements from the two parameters.
 */
public class MethodsWithArrayList8CombineAll_rep198 {
    //create your method below


    public  static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2){

        ArrayList<String> combinedList  = new ArrayList<>();

        // ArrayList<String> combineList  = new ArrayList<>(wordList1);
        //  combinedList.addAll(wordList2);

        combinedList.addAll(wordList1);
        combinedList.addAll(wordList2);

        return combinedList;
    }


}
