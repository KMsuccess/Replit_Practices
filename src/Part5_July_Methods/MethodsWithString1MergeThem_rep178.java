package Part5_July_Methods;
/*
When gears merge and work together, one teeth from each one goes in order.
Write a method mergeStrings hat will return the strings merged, one letter at a time, starting with one.
Please note one and two can be of different lengths. Please look at below examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"

mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */

public class MethodsWithString1MergeThem_rep178 {

    public static String mergeStrings(String one, String two) {

        String merged="", longerString = "";
        int shorterCharCNT = 0;

        if(one.length()>two.length()){
            longerString = one;
            shorterCharCNT = two.length();
        }else{
            longerString = two;
            shorterCharCNT = one.length();
        }
        for(int i =0; i< shorterCharCNT; i++){
            merged += "" + one.charAt(i) + two.charAt(i);
        }
        merged += longerString.substring(shorterCharCNT);
        return  merged;
    }



}
