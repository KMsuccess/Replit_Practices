package Java_Interveiw_Coding_Session;

public class NumberIsPrimeMethod {

/*
48. Write a method that can check if a number is prime or not
 */

    public boolean primeNumber(int num) {
        if(num < 2) {
            return false;
        }
        for(int i = 2; i < num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
