package Part7_August_September;
import Group_30_Practice.P2.Array;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

/*
Create a static method that:
is called repeatAL
returns nothing
takes in a single parameter - an ArrayList of Booleans

This method should modify its ArrayList parameter by repeating its ArrayList values.

For example, if the parameter is
(true, false, false)
The modified ArrayList should be
(true, false, false, true, false, false)
 */
public class MethodsWithArrayList12_RepeatAll_rep206 {

    public static void main(String[] args) {

    }
    //create your method below
    public  static  void repeatAL(ArrayList<Boolean>lst){

        // (true, false, false)
        // (true, false, false, true, false, false)
        int count = lst.size();
        for (int i =0; i < count; i++){
            lst.add(lst.get(i));


        }
    }
}
