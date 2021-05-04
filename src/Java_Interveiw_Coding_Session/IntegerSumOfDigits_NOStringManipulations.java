package Java_Interveiw_Coding_Session;

public class IntegerSumOfDigits_NOStringManipulations {

    /*
    52. write a function that can return the sum of digits of an integer
    Do not use any string manipulations
    Ex: input: 123
    output: 6
     */

    public static int sumOfDigits(int number) {          // 123   1+2+3
        int sum = 0;
        while (number > 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
        /*
             // 123 % 10 = 3 sum / (12%10)==>3+2=5 / (1%10)  ==>5+1=6
             // 123/10 = 12  num / 12:10=1        / 1:10=0/  ==>  6+0 =6
         */

    }
//==================================================================================
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
//
//        int a =9;
//        int b = a%10;
//        System.out.println(b);
    }
}
