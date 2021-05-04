package Part5_July_Methods;

/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.

Example:
input:[2, 5, 5, 6, 3, 6, 9, 34, 3]
output:
2
9
34
 */
import java.util.*;

public class Methods_14_PrintUniqueNumbers_rep159 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for(int i =0; i < nums.length; i++){

              boolean isUnic = true;
              int  count = 0;
            for(int x = 0; x <nums.length; x++){
                if(i != x && nums[i] == nums[x] ){
                  isUnic =false;
                }

            }
            if(isUnic) {
                System.out.println(nums[i]);
            }
        }

    }
}
