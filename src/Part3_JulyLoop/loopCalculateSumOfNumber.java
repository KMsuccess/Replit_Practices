package Part3_JulyLoop;
import java.util.*;
/*
calculate the sum of all the numbers up to the n variable.

for example:

n=3

sum = 1+2+3 = 6

n = 5
 sum = 1+2+3+4+5 = 15

hint: use a loop
 */
public class loopCalculateSumOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;

        for(int i=0; i <=n; i++){
            sum +=i;
        }
        System.out.println(sum);
    }
}
