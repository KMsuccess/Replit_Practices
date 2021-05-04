package Part5_July_Methods;

import java.util.Scanner;

/*
create a static method called "plus", its return is void and it gets no arguments.

It asks the user to input two numbers, then it will add them and print the result.
Create a scanner within plus method.

Example:

enter first number:
1
enter second number:
2
result: 3
*/


public class Methods1_SimpleCalculator_146 {
    public static void main(String[] args) {

        plus();
    }
    public static void plus() {

        //your code here
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

         int sum = num1 + num2;
        System.out.println("result: "+sum);

    }
}
