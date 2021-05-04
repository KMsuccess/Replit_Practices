package Part5_July_Methods;
/*
Create a method printHollowRect that prints a 5 on 5 hollow rectangle:

*****
*   *
*   *
*   *
*****

hint:you will need to use two nested for loops for that, and an if that checks if its the last or first iteration
of the loop (so you will know whet to print "*" or " ")
 */
public class Methods5_SimplePrintPattern {

    public static void printHollowRect() {
        // write your codes here

        for (int i = 0; i <= 0; i ++) {
            System.out.println("*****");

            for (int j = 0; j <= 2; j++) {
                System.out.println("*   *");
            }
        }

        for(int k = 0; k <= 0; k ++) {
            System.out.println("*****");
            System.exit(0);
        }
    }


    public static void main(String[] args) {

        printHollowRect();
    }


}