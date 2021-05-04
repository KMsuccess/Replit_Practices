package Part5_July_Methods;
/*
Create a method called plus_minus that gets an array of ints (int[]),
it outputs how many negative , positive and zero numbers are in the array.

for example:

plus_minus (new int[]{1,2,55,-9,-2,0});

will output:
positives:3, negatives:2, zeros:1
 */
import java.util.Scanner;

public class Methods7Plus_minus152 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ;i<=size-1;i++)
        {

            arr[i]=inp.nextInt();
        }

        plus_minus(arr);
    }//end main

    private static void plus_minus(int[] arr) {

        int countNegatives =0;
        int countZero =0;
        int countPlus=0;

        for(int each: arr) {
            if (each > 0) {
                countPlus++;
            }
            if (each == 0) {
                countZero++;
            }
            if (each < 0) {
                countNegatives++;
            }

        }
        System.out.println("positives:" + countPlus + ", " + "negatives:" + countNegatives + ", " + "zeros:" + countZero);
    }

}


