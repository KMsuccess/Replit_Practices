package Java_Interveiw_Coding_Session;

import java.util.Arrays;
import java.util.List;

public class IntegerList_AllZerosToTheEndOfTheList {

    /*
    35. write a program that can move all the zeros to the end of the List of
    integers
     */

    public static List<Integer> moveZerosToTheEnd(List<Integer> list){
        int originalSize = list.size();
        list.removeAll(Arrays.asList(0));
        int newSize = list.size();
        int totalNumberOfZeros = originalSize-newSize;
        for(int i = 0; i < totalNumberOfZeros; i++){
            list.add(0);
        }
        return list;
    }
//==================================================================
    public static void main(String[] args) {                           //?????????????????

    }


}
