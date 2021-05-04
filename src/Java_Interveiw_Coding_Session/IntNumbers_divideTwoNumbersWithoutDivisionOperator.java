package Java_Interveiw_Coding_Session;

public class IntNumbers_divideTwoNumbersWithoutDivisionOperator {

    /*
    14. Write a method that can divide two numbers without using
division operator
     */

  //  Solution:
    public void devides(int num1, int num2) {
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" devid by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);
    }
}
