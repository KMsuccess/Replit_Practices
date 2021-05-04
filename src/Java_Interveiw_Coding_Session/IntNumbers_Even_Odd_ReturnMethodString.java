package Java_Interveiw_Coding_Session;

public class IntNumbers_Even_Odd_ReturnMethodString {
    /*
    13. Write a method which can identifies given number is even or
odd
EX:
identify(5) -> "Odd"
identify(6) -> "Even
     */

  //  Solution:
    public String identifyOddEven( int n ) {
        return n%2==0 ? "Even" : "odd" ;
    }
}
