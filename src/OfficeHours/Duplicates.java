package OfficeHours;

import java.util.*;

/*
 * Create a method will take an Integer ArrayList and remove any duplicates values.
 Return an ArrayList of unique elements.

 */
public class Duplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(4,23,1,4,23,5,3,5,7));
        System.out.println(removeDup(list));


        System.out.println(new TreeSet<>(list));
    }

    // 1-nd method
        public static ArrayList<Integer> removeDup(ArrayList<Integer>nums){

            ArrayList<Integer> uniqueValues = new  ArrayList<>();
            for(Integer each : nums){
                if(!uniqueValues.contains(each)){
                    uniqueValues.add(each);
                }
            }
             return uniqueValues;
        }

// 2-nd method
    public static ArrayList<Integer> removeDup2(ArrayList<Integer>nums){

        new HashSet<>(nums);
        return  new ArrayList<>(new LinkedHashSet<>(nums));

    }


}
