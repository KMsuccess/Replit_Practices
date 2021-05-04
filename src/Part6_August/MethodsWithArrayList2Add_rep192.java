package Part6_August;

import Self_Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;

/*
We will be manipulating elements of an ArrayList by using List methods.

The first List method we will learn is .add()

The following code will take an ArrayList of Strings called strs and add "Hello" to it.
str.add("Hello");

The syntax follows something like:
arraylist variable.add(data to add);

In the space to the left, add three names (any names) to the ArrayList called names.
 */

public class MethodsWithArrayList2Add_rep192 {
    public static ArrayList<String> test()
    {
        ArrayList<String> names = new ArrayList<String>();
        //write code below

       names.add("Hello!");
        names.add("Hello!");
        names.add("Good morning!");
        //leave below code alone
        return names;
    }
}