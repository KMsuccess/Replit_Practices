package Java_Interveiw_Coding_Session;

public class IntegerFibonacciOfAnyGivenNumber {

    /*
    46. Write a return method that returns the Fibonacci of any given
    numbers
     */
    public static int fibonacci (int num){     // ?????     i put static
        int result=0;
        int j=0;
        int z=1;
        for(int i=1; i<num; i++){
            result=j+z;
            j=z;
            z=result;
        }
        return result;
    }
//===========================================================
    public static void main(String[] args) {

        System.out.println(fibonacci(8)); // 10235813

    }
}
