package Part5_July_Methods;
/*
Given method called cube. Write all required code inside this method in order  to asks the user
for a number and then prints the cubed value of that number:

Example:

input: 5
output: 125

hint: cube of a number n = n*n*n
 */
import java.util.Scanner;
public class Methods3_FindCube_Rep_148 {


    //your code here
    public static void cube() {
        Scanner scan = new Scanner(System.in);
        System.out.println("print number");

        int n = scan.nextInt();
        int c = n * n * n;
        System.out.println("" + c);
    }

    //end cube

    public static void main(String[] args) {

        cube();

    }

}
