package Part6_August;

/*
Create a method that:
is called timesTwo
returns nothing
takes in a single parameter - an ArrayList of Integers called nums

This method should take the ArrayList parameter and multiply every value by two.
 */

import java.util.ArrayList;

public class MethodsWithArrayList11TimesTwo_rep202
{
    public static void main(String[] args)
    {

    }
    //create your method below

    public static void timesTwo(ArrayList<Integer> nums){
        for(int i = 0; i < nums.size(); i ++){
            nums.set(i, nums.get(0)*2);
        }




    }

}