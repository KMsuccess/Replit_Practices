package Part6_August;

import Self_Practice.Array;

import javax.sql.rowset.serial.SerialStruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
/*
combine two String arrays into one arraylist and return it as a string.

for example:

combineRs(["f","o","o"],[" b","a","r"])
returns "foo bar"


combineRs(["1","2","3"],[" 4"])
returns "1234"
 */
public class MethodsWithArrayList3CombineArrays_rep193 {

    public static String combineRs(String[] r1,String[] r2)
    {
        ArrayList<String> items =new ArrayList<>();

        for(String each : r1){
            items.add(each);
        }
        for(String each : r2){
            items.add(each);
        }
           String result = "";

        for(String eachItem : items){
            result += eachItem;
        }


        // for(int i =0; i < items.size(); i++) {          also can do like this
        //     result += items.get(i);
        // }

        return result ;
    }
}
