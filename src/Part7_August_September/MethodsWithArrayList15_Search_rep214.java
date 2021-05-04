package Part7_August_September;
import java.util.*;

/*
search method accepts ArrayList of Strings and String find.
and returns a String.
It will look for an element within ArrayList that contains value of find
if it finds it, methods needs to return whole Element value.
if  an instance of find doesn't exist return:"search failed"

for example:
 */

import java.util.ArrayList;

public class MethodsWithArrayList15_Search_rep214 {


    public static String search(ArrayList<String> r, String find)
    {

        for(String current: r){
            if(current.contains(find)){
                return  current;
            }

            }
        return  "serch failed";
    }//end wineSeller

    public static void main(String[] args)
    {
        ArrayList<String>  arr = new ArrayList<String>();
        arr.add("2");
        arr.add("6");
        arr.add("foo bar");
        arr.add("abc");
        System.out.println(arr);

        String find_tst = search(arr,"foo");
        System.out.print(find_tst);//foo bar


    }//end main
}
