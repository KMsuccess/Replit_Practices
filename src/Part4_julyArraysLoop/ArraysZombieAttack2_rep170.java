package Part4_julyArraysLoop;
/*

Write a program to loop though each city population and make it lose half of its population
if it is adjacent(right or left) to a city with zero people until all cities have no humans left.

 Make updates to each element in the array And print the array like below for each day:

Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----

Write the program in a way that it will handle any number of people in cities, above was just an example numbers to follow.

Hint:
Below expression will print array in this format:

[3, 6, 0, 4, 3, 2, 7, 0]

Code:
System.out.println(Arrays.toString(inhabitants)));
 */
import java.util.Scanner;
import java.util.Arrays;

public class ArraysZombieAttack2_rep170 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for (int i = 0; i < inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }
        //TODO. Write you code below this line.


           for(int j =0; j< inhabitants.length; j++){
               int sum = 0;
               System.out.println("Day " + (j) + " " + Arrays.toString(inhabitants));

               for(int i= 0; i <inhabitants.length; i++){
                   inhabitants[i] = inhabitants[i]/2;
                   sum +=inhabitants[i];
               }
               if(sum == 0){
                   System.out.println("Day " + (j+1) + " " + Arrays.toString(inhabitants));
                   System.out.println("---- EXTINCT ----");
                   break;
               }
           }
           /*

        //TODO. Write you code below this line.
        for (int j = 0; j < inhabitants.length; j++) {
            int sum = 0;
            System.out.println("Day " + (j) + " " + Arrays.toString(inhabitants));

            for (int i = 0; i < inhabitants.length; i++) {
                inhabitants[i] = inhabitants[i] / 2;
                sum += inhabitants[i];
            }

            if (sum == 0) {
                System.out.println("Day " + (j + 1) + " " + Arrays.toString(inhabitants));
                System.out.println("---- EXTINCT ----");
                break;
            }

        }

    }
}
            */

    }
}
