package Part4_julyArraysLoop;
/*
Given an array nums with 7 integers every element is repeated twice - except one. Find that element and print it to console.

Example:

nums -> [1, 1, 2, 3, 4, 3, 4]
         2
 */
import java.util.*;
public class ArraysFndNonDuplicate_rep122 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO: write your code below

        for(int i =0; i<nums.length; i++){

            int count = 0;
            for(int each: nums){
                if(each == nums[i]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(nums[i]);
            }
        }



    }
}
