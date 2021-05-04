package Part6_August;

import java.util.*;

/*
In this task, you need to write 2 methods findMax() that will find a maximum number in the array.
 First method should work with array of integers (int[]) and return int,
  and second method should work with an array of doubles (double[]) and return double as a result.
Methods must have the same name and different parameters.
Fo more information:  https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html

Comment: Methods should be non static and with a return type.
 */
public class MethodOverloading1_rep188 {

    //WRITE YOUR CODE HERE

    public int findMax(int[] num){

       int max= num[0];         // Integer.MAX_VALUE
       for(int each: num){
           if(each>max){
               max = each;
           }
       }
           return max;
    }

    public  double findMax(double[] num) {

       double max2 = num[0];              // Double.MAX_VALUE
        for (double each : num) {
            if (each > max2) {
                max2 = each;
            }
        }
        return max2;

        




    }

}
