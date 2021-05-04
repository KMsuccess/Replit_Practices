package Part6_August;

/*
Create a method that:
is called twoTimes
returns a new ArrayList of Integers
takes in a single parameter - an ArrayList of Integers
This method should create a new ArrayList of Integers that contains every value of the ArrayList parameter repeated twice.

For example, if the parameter is
(1,5,3,7)
The method should return a new ArrayList of Integers with
(1,1,5,5,3,3,7,7)
 */

import java.util.ArrayList;
public class MethodsWithArrayList16_2Times_rep215 {
    public static void main(String[] args) {

    }
    //create your method below

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> lst) {

        ArrayList<Integer> newLst = new ArrayList<>();

       /*
        for (int i = 0; i < lst.size(); i++)

            newLst.add(lst.get(i));
            newLst.add(lst.get(i));
        */

        for(Integer each: lst){
            newLst.add(each);
            newLst.add(each);
        }
        return newLst;

    }


}
