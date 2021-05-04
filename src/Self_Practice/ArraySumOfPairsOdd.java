package Self_Practice;

import java.util.ArrayList;

public class ArraySumOfPairsOdd {

                                                       //  first method
    public  static boolean solution(int[] A) {

        int countOdd = 0;
        int countEven = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                countEven++;
            }
            if (A[i] % 2 != 0) {
                countOdd++;
            }
        }
        return countEven == countOdd;
    }
    //====================================================================

    public static boolean solution1(int[] A) {     // i add static

        int countEven = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                countEven++;
            }
        }
        return countEven==A.length/2;
    }
    //============================================================================


    public static void main(String[] args) {
//        int A [] = {1,2,3,4,5,6,7,8};
//        System.out.println("solution(A) = " + solution(A));


        int A [] = {1,2,3,4,5,6,7,8};
        System.out.println("solution1(A) = " + solution1(A));

//        int A [] = {1,2,3,4,5,6,7,8};
//        System.out.println("solution(A) = " + solution(A));

    }

    //===========================================================================
    public static boolean   solution2(int[] A) {   //  {1,2,3,4,5,6,7,8}     ???????? in progress)

        ArrayList <Integer> list= new ArrayList<>();
        if(A.length%2==0){

            for (int each : A){
                list.add(each);
            }

            for (int i=0;i<list.size();i++){

                for(int k=1; k<list.size();k++){
                    if((A[i]+A[k])%2!=0){
                      list.remove(i);
                      list.remove(k);
                      if(list.size()>=2){
                          i=0;
                          k=1;
                      }
                    }
                }
            }
            System.out.println(list.size());
            return list.size()==0;
        }
        System.out.println(list.size());
        return list.size()==0;

    }


}




