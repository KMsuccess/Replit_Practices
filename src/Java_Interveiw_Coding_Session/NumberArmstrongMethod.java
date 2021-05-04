package Java_Interveiw_Coding_Session;

public class NumberArmstrongMethod {

  /*
  47. Write a method that can check if a number is Armstrong number
   */

    public boolean isArmStrongNumber(int num) {
        int a = 0, b =0, c= num;
        while(num>0){
            a=num%10;
            num/=10;
            b=b+(a*a*a);
        }
        return (c==b)? true : false;
    }
}
