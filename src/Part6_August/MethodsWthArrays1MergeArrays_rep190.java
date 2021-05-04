package Part6_August;

/*
mergR merges two arrays into one.
it gets two int arrays and returns an int array

for example:

mergR([1,2,3],[4,5,6])
returns [1,2,3,4,5,6]

mergR([1,2],[6,8])
returns [1,2,6,8]

hint:
create a length int for the combined length of both arrays.
create an array with that length (thats the array we will return).
create an iterator for both arrays (int z=0).

loop first array and inside the loop insert current element to the return array (ret[z]=a[i];)
then increment the iterator for both arrays (z++).

do the same for the second array.
 */

import java.util.Arrays;

public class MethodsWthArrays1MergeArrays_rep190 {

    public static int[] mergR(int[] a,int[] b) {

      int [] mergedArr = new int[a.length + b.length];
      for(int i = 0; i < mergedArr.length; i++){

          if(i<a.length){
              mergedArr[i] = a[i];
          }else{
              //mergedArr[4] = b[4-3 =1]
              mergedArr[i] = b[i - a.length];
          }

      }
         return mergedArr;

    }//end mergR

    public static void main(String[] args)
    {

    }
}