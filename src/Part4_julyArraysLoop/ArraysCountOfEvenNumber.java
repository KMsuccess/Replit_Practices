package Part4_julyArraysLoop;
/*
Given an array nums, calculate the count of even numbers in nums and print out to console.

nums → [2, 1, 2, 2, 1, 2,  3,  4, 3, 4]) → 6
nums → [2, 2, 5, 7, 9, 0,  3,  5, 2, 2]) → 5
nums → [1, 1,21,21,25,13, 17, 29, 11,3])  → 0
 */
import java.util.*;

public class ArraysCountOfEvenNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i = 0 ; i<=9 ; i ++){
            nums[i] = input.nextInt();
        }
        // above code will ask user 10 numbers while creating an array
        // just assume that you have int array with 10 numbers and start working on requirement
        // loop through the array and get the count of the even numbers
        //TODO: Write your code below

        int countEven = 0;
/*
        for(int j=0; j<=9;j++){

            if(nums[j]%2==0){
                countEven++;
            }
        }
        System.out.println(countEven);
*/

        for(int each : nums){
            if(each%2 ==0){
              countEven++;
            }
        }
        System.out.println(countEven);


    }
}
