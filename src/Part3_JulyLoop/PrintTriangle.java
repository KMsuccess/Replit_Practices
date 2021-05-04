package Part3_JulyLoop;
/*
Assume that the int variables i and j have been declared, and that n has been declared and initialized.
Using for loops (you may need more than one), write code that will cause a triangle of asterisks of size n
to be output to the screen.

Example:
input: 5
output: *
output: **
output: ***
output: ****
output: *****

Example:
input: 3
output: *
output: **
output: ***
 */
import java.util.Scanner;

public class PrintTriangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(i = 1; i<=n;i++ ){

            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
/*
 for(int j = 1; j <= 7; j++){ // j:  1, 2, 3, 4, 5, 6, 7

            for(int k = 1; k <= j; k++){ //k: 1, 2, 3, 4, 5, 6, 7
                System.out.print("*");
            }
            System.out.println();

        }
 */

    }
}
